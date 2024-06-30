package com.mycompany.exercise_26_05;

/**
 * AVL Tree class updated with AVLTreeNode information of parent of Node
 * All balance methods are updated to reflect the change of AVLTreeNode parent variable
 * @author DEJAN
 */
public class AVLTree<E> extends BST<E> {

    /**
     * Create an empty AVL tree using a natural comparator
     */
    public AVLTree() {
        //super() is implicitaly called
    }

    /*Create a BST with specified comparator*/
    public AVLTree(java.util.Comparator<E> c) {
        super(c);
    }

    /*Create an AVL tree from an array of objects*/
    public AVLTree(E[] objects) {
        super(objects);
    }

    @Override //Overide createNewNode to create an AVLTreeNode
    protected AVLTreeNode<E> createNewNode(E e) {
        return new AVLTreeNode<E>(e);
    }

    @Override //Insert an element and rebalance if neccessary
    public boolean insert(E e) {
        boolean successfull = super.insert(e);
        if (!successfull) {
            return false; //e is already in the tree
        } else {
            balancePath(e); //Balance from e to root if neccessary
            //Update size in AVLTreeNode
        }
        updateAVLTreeNodeSize();
        return true; //e is inserted
    }
    
    //Update node size for all nodes in the tree
    public void updateAVLTreeNodeSize(){
        for (E e: this) {
            updateNodeSize(e);
        }
    }
    
    /*Helper mathod  for Update node Size*/
    public void updateNodeSize(E e){
        AVLTreeNode<E> node = (AVLTreeNode<E>) getNode(e);
        node.size = getNodeSize(e);
    }
    /* Recursively getNodeSize*/
    public int getNodeSize(E e){
        AVLTreeNode<E> node = (AVLTreeNode) getNode(e);
        if (isLeaf(e)) return 1; //node is a leaf
        if (node.right == null) return getNodeSize(node.left.element) + 1;
        else if (node.left == null) return getNodeSize(node.right.element) + 1;
        
        else node.size = getNodeSize(node.left.element) + getNodeSize(node.right.element) + 1;

        return node.size;
        
    }
    
    /* method to return the kth smallest  element 
    * in the tree: public E find(int k)
    * method : find(k, root) = E can bi defined as folows
    *          -> root.element, if A is null and k is 1;
    *          -> B.element, if A is null and k is 2;
    *          -> find(k, A), if k 6 = A.size;
    *          -> root.element, if k = A.size + 1;
    *          -> find(k- A.size- 1, B), if k 7 A.size + 1
    */
    public E find (int k) {
        if (k < 1 || k > size) return null;
        return find (k, root);
    }
    //Helper recursive method for find kth element
    public E find (int k, TreeNode<E> root) {
        AVLTreeNode<E> A = (AVLTreeNode) root.left;
        AVLTreeNode<E> B = (AVLTreeNode) root.right;
        if (A == null && k == 1) return root.element;
        else if(A == null && k == 2) return B.element;
        else if (k <= A.size) return find (k, A);
        else if (k == A.size +1) return root.element;
        else if (k > A.size + 1) return find(k-A.size-1, B);
        return null;
    }

    //Update the height of a specified node
    private void updateHeight(AVLTreeNode<E> node) {
        if (node.right == null && node.left == null)//leaf node
        {
            node.height = 0;
        } else if (node.left == null) //node has no left tree
        {
            node.height = 1 + ((AVLTreeNode<E>) node.right).height;
        } else if (node.right == null) //node has no right tree
        {
            node.height = 1 + ((AVLTreeNode<E>) (node.left)).height;
        } else {
            node.height = 1 + Math.max(((AVLTreeNode<E>) node.left).height,
                    ((AVLTreeNode) node.right).height);
        }    
    }

    /**
     * Balance the nodes in the path from the specified node to the root if
     * necessary
     */
    private void balancePath(E e) {
        java.util.ArrayList<TreeNode<E>> path = path(e); //Balance node get path
        for (int i = path.size() - 1; i >= 0; i--) {
            AVLTreeNode<E> A = (AVLTreeNode<E>) path.get(i);
            updateHeight(A);
            AVLTreeNode<E> parentOfA = (A == root) ? null : (AVLTreeNode<E>) path.get(i - 1);
            switch (balanceFactor(A)) {
                case -2:
                    if (balanceFactor((AVLTreeNode) A.left) <= 0) {
                        balanceLL(A, parentOfA); //Perform LL rotation
                    } else {
                        balanceLR(A, parentOfA); //Perform LR Rotation
                    }
                    break;
                case +2:
                    if (balanceFactor((AVLTreeNode<E>) A.right) >= 0) {
                        balanceRR(A, parentOfA);  //Perform RR Rotation

                    } else {
                        balanceRL(A, parentOfA); //Perform RL Rotation

                    }
            }

        }
    }

    /**
     * Return the balance factor of the node
     */
    public int balanceFactor(AVLTreeNode<E> node) {
        if (node.right == null) //node dosnt have right subtree
        {
            return -node.height;
        } else if (node.left == null) // node has not left subtree
        {
            return +node.height;
        } else {
            return ((AVLTreeNode<E>) node.right).height
                    - ((AVLTreeNode<E>) node.left).height;
        }
    }

    /**
     * Balance LL (see Figure 26.3)
     */
    public void balanceLL(TreeNode<E> A, TreeNode<E> parentOfA) {
        TreeNode<E> B = A.left; //A is left heavy and B is left heavy
        if (A == root) {
            B.parent = null;
            if (B.right != null) B.right.parent = A;
            root = B;
            A.parent = B;
        } else {
            if (parentOfA.left == A) {
                if (B.right != null) B.right.parent = A;
                parentOfA.left = B;
                B.parent = parentOfA;
                A.parent = B;
            } else {
                if (B.right != null) B.right.parent = A;
                parentOfA.right = B;
                B.parent = parentOfA;
                A.parent = B;
            }
        }
        A.left = B.right; //Make T2 the left subtree of A
        B.right = A; //Make A the right child of B
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
    }

    /**
     * Balance RR (see Figure 26.4)
     */
    public void balanceRR(TreeNode<E> A, TreeNode<E> parentOfA) {
        TreeNode<E> B = A.right; //A is right heavy and B is right heavy
        if (A == root) {
            B.parent = null;
            if (B.left != null)B.left.parent = A;
            root = B;
            A.parent = B;
        } else {
            if (parentOfA.left == A) {
                if (B.left != null)B.left.parent = A;
                B.parent= parentOfA;
                A.parent = B;
                parentOfA.left = B;
               
            } else {
                if (B.left != null)B.left.parent = A;
                B.parent = parentOfA;
                A.parent = B;
                parentOfA.right = B;
                
            }
        }
        A.right = B.left; // Make T2 the right subtree of A
        B.left = A; // Make A the left child of B
       
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
    }

    /**
     * Balance LR (see Figure 26.5)
     */
    public void balanceLR(TreeNode<E> A, TreeNode<E> parentOfA) {
        
        TreeNode<E> B = A.left; //A is left-heavy
        TreeNode<E> C = B.right; //B is right-heavy
        if (A == root) {
            if (C.left != null) C.left.parent = B;
            if (C.right != null) C.right.parent = A;
            C.parent = null;
            root = C;
            A.parent = C;
            B.parent = C;
        } else {
            if (parentOfA.left == A) {
                if (C.left != null) C.left.parent = B;
                if (C.right != null) C.right.parent = A;
                parentOfA.left = C;
                C.parent = parentOfA;
                B.parent = C;
                A.parent = C;
            } else {
                if (C.left != null) C.left.parent = B;
                if (C.right != null) C.right.parent = A;
                parentOfA.right = C;
                C.parent = parentOfA;
                B.parent = C;
                A.parent = C;
            }
        }
        A.left = C.right; // Make T3 the left subtree of A
        B.right = C.left; // Make T2 the right subtree of B
        C.left = B;
        C.right = A;
        //Adjust the heights
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
        updateHeight((AVLTreeNode<E>) C);
    }

    /**
     * Balance RL (see Figure 26.6)
     */
    public void balanceRL(TreeNode<E> A, TreeNode<E> parentOfA) {
        
        TreeNode<E> B = A.right; // A is right heavy
        TreeNode<E> C = A.right.left; //B is left heavy

        if (A == root) {
            if (C.left != null) C.left.parent = A;
            if (C.right != null) C.right.parent = B;
            C.parent = null;
            root = C;
            A.parent = C;
        } else {
            if (parentOfA.left == A) {
                if (C.left != null) C.left.parent = A;
                if (C.right != null) C.right.parent = B;
                parentOfA.left = C;
                C.parent = parentOfA;
                B.parent = C;
                A.parent = C;
            } else {
                if (C.left != null) C.left.parent = A;
                if (C.right != null) C.right.parent = B;
                parentOfA.right = C;
                C.parent = parentOfA;
                B.parent = C;
                A.parent = C;
            }
        }
        A.right = C.left; // Make T2 the right subtree of A
        B.left = C.right; // Make T3 the left subtree of B
        C.left = A;
        C.right = B;
        //Adjust the heights
        updateHeight((AVLTreeNode<E>) A);
        updateHeight((AVLTreeNode<E>) B);
        updateHeight((AVLTreeNode<E>) C);

    }

    @Override
    /**
     * Delete an element from the binary tree. Return true if the element is
     * deleted successfully Return false if the element is not in the tree
     */
    public boolean delete(E element) {
        if (root == null) {
            return false; //Empty tree - element is not in the tree
        }        // Locate the node to be deleted and also locate its parent node
        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null) {
            if (c.compare(element, current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (c.compare(element, current.element) > 0) {
                parent = current;
                current = current.right;
            } else {
                break; // The element is in the tree pointed by current;
            }
        }
        if (current == null) {
            return false; // The element is not in the tree
        }        // Case 1: current has no left children (See Figure 23.6)
        if (current.left == null) {
            // Connect the parent with the right child of the current node
            if (parent == null) {
                root = current.right;
            } else {
                if (c.compare(element, parent.element) < 0) {
                    parent.left = current.right;
                } else {
                    parent.right = current.right;
                }
                // Balance the tree if necessary
                balancePath(parent.element);
            }
        } else {
            // Case 2: The current node has a left child
            // Locate the rightmost node in the left subtree of
            // the current node and also its parent
            TreeNode<E> parentOfRightMost = current;
            TreeNode<E> rightMost = current.left;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;//Keep going to the right
            }
            // Replace the element in current by the element in rightMost
            current.element = rightMost.element;
            //Eliminate the rightmost Node
            if (parentOfRightMost.right == rightMost) {
                parentOfRightMost.right = rightMost.left;
            } else {
                // Special case: parentOfRightMost is current
                parentOfRightMost.left = rightMost.left;
            }
            // Balance the tree if necessary
            balancePath(parentOfRightMost.element);
        }
        size--;
        updateAVLTreeNodeSize();
        return true;
    }
    
    
 
    
    /**
     * AVLTreeNode is TreeNode plus height
     */
    protected static class AVLTreeNode<E> extends BST.TreeNode<E> {

        protected int height = 0;
        protected int size = 0;

        public AVLTreeNode(E o) {
            super(o);
        }
    }
}

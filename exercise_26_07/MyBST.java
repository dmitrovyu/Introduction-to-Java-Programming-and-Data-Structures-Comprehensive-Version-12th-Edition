package com.mycompany.exercise_26_07;

/**
 *
 * @author DEJAN
 */
public class MyBST<E> extends BST<E> {

    /**
     * Returns true if the tree is an AVL tree, otherwise false.
     */
    // Returns the height of this binary tree, i.e., the 
    // number of the nodes in the longest path of the root to a leaf 
    public int height() {
        return height(root);
    }

    public int height(TreeNode<E> root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    // Returns true if the tree is an AVL tree
    public boolean isAVLTree() {
        return isAVLTree(root);
    }

    // Returns true if the tree is an AVL tree at the specified root
    public boolean isAVLTree(TreeNode<E> root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Check if the current node is balanced and recursively check subtrees
        if (Math.abs(leftHeight - rightHeight) <= 1 && isAVLTree(root.left) && isAVLTree(root.right)) {
            return true;
        }
        return false;

    }
}

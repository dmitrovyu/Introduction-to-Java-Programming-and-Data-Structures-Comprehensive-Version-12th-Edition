
package com.mycompany.exercise_25_17;

import java.util.Stack;

/**
 * Define a Huffman coding tree
 * @author DEJAN
 */
public class HuffmanTree  implements Comparable<HuffmanTree> {
    Node root; //root of the tree
    /*
    * Create a tree with two subtrees
    */
    public HuffmanTree  (HuffmanTree t1, HuffmanTree t2){
        root = new Node();
        root.left = t1.root;
        root.right = t2.root;
        root.weight = t1.root.weight + t2.root.weight;
    }
    /*
    * Create a tree containg a laf node
    */
    public HuffmanTree(int weight, char element){
        root = new Node(weight, element);
    }
    
    /*
    * Compare trees based o their weight
    */
    @Override
    public int compareTo(HuffmanTree t){
        if (root.weight < t.root.weight)
            return 1;
        else if (root.weight == t.root.weight)
            return 0;
        else return -1;
                
    }
    
    public class Node {
        char element; //Stores the character of the leaf
        int weight; //weght of the subtree rooted in this node
        Node left; //Left child of the Node
        Node right; // Right child of the Node
        String code = ""; //The code of this node to the root
        
        /*
        * Create an empty Node
        */
        public Node() {
            
        }
        
        /*
        * Create Node with specified element and weight
        */
        public Node(int weight, char element){
            this.weight = weight;
            this.element = element;
               
        }
    }
        /*
        * Get String value for the element of the Node
        */
        public String getCode(char element){
            Stack<Node> stack = new Stack();
            Node current = root;
            
            while(current != null || !stack.isEmpty()){
                while(current != null){
                    stack.push(current);
                    current = current.left;
                }
                Node top = stack.pop();
                if(top.element == element) return top.code;
                current = top.right;
                
            }
            return null; // There is no element
        }
        
        /*
        * Decoding the bit value to String
        */
        public String decode(String bitString){
            char[] elements = bitString.toCharArray();
            int index = 0;
            String encoded = "";
            while (index < elements.length){
                Stack<Node> stack = new Stack<>();
                stack.push(root);
                while(!stack.isEmpty()){
                    Node current = stack.pop();
                    if(current.left == null && current.right == null){
                        encoded += current.element;
                        break;
                    }
                    if(elements[index] == '0')
                        stack.push(current.left);
                    else
                        stack.push(current.right);
                    index++;
                }
            }
            return encoded;
        }
    }


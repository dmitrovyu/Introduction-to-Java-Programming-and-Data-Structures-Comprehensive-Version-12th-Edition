

package com.mycompany.exercise_25_16;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * ***25.16 (Data compression: Huffman coding) Write a program that prompts the user to
 * enter a file name, then displays the frequency table of the characters in the file
 * and the Huffman code for each character.
 *
 *
 * @author D.Dejan
 */
public class Exercise_25_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        
        String txt = "";
        try(Scanner file = new Scanner(new File(fileName))){
            while (file.hasNext()){
                    txt +=file.next()+" ";
            }
                
            
        }
        catch(IOException excp){
            System.out.println("Something wrong: " + excp.getMessage());
        }
        int[] counts = getCharacterFrequency(txt); //Count frequency
       
        System.out.printf("%-15s%-15s%-15s%-15s\n", "ASCII Code","Character", "Frequency", "Code");
        Tree tree = getHuffmanTree(counts); //Create a Huffman tree
        
        String[] codes = getCode(tree.root);//Get codes
        
        for (int i = 1; i<codes.length; i++)
            if (counts[i] != 0) //(char)i is not in text if counts[i] is 0
                System.out.printf("%-15d%-15s%-15d%-15s\n",i,(char) i + "", counts[i], codes[i]);
                
    }
    /**
     * Get Huffman codes for the characters
     * This method is called once after a Huffman tree is built
     */
    public static String[] getCode(Tree.Node root) {
        if (root==null) return null;
        String[] codes = new String[2*128];
        assignCode(root, codes);
        return codes;
    }
    /* Recursively get codes to the leaf node */
    private static void assignCode(Tree.Node root, String[] codes){
        if (root.left != null) {
            root.left.code = root.code + "0";
            assignCode(root.left, codes);
            
            root.right.code = root.code + "1";
            assignCode(root.right, codes);
            
        }
        else {
            codes[(int) root.element] = root.code;
        }
    }
    
    /**
     * Get a Huffman tree from the codes
     */
    
    public static Tree getHuffmanTree(int[] counts){
        //Create Heap to hold the trees
        Heap<Tree> heap = new Heap<>();
        for (int i =0; i <counts.length; i++) {
            if(counts[i] > 0)
                heap.add(new Tree(counts[i], (char) i)); //A leaf Node
            
        }
        while(heap.getSize()>1){
            Tree t1 = heap.remove(); // Remove the smallest−weight tree
            Tree t2 = heap.remove(); // Remove the next smallest
            heap.add(new Tree(t1,t2)); //Combine two trees
        }
        return heap.remove();
        
    }
    /**
     * Get the frequency of the characters
     */
    
    public static int[] getCharacterFrequency(String text){
        int[] counts = new int[256]; // 256 ASCII characters
        for(int i = 0; i < text.length(); i++){
            counts[(int) text.charAt(i)]++; //Counts characters in the text 
        }
        return counts;
    }
    
    
    /**
     * Define a Huffman coding tree
     */
    public static class Tree implements Comparable<Tree> {
        Node root; //The root of the tree
        
        //Create tree from two subtrees
        public Tree(Tree t1, Tree t2) {
           root = new Node();
           root.left = t1.root;
           root.right = t2.root;
           root.weight = t1.root.weight + t2.root.weight;
        }
        
        
         // Create a tree containing a leaf node
         public Tree(int weight, char element){
             root = new Node(weight,element);
         }
         /** Compare trees based on their weights */
         @Override
         public int compareTo(Tree t){
            if (root.weight < t.root.weight)//Reverse the order
                return 1;
            else if(root.weight == t.root.weight)
                return 0;
            else return -1;
         }
         
         public class Node {
             char element; //Stores the character for the leaf node
             int weight; //weight of the subtree rooted of this node
             Node left; //Reference to the left subtree
             Node right; // Reference to the right subtree
             String code = ""; //The code of this node to the root
             
             //Create an empty node
             public Node() {
                 
             }
             //Create a node with specified weight and character
             public Node(int weight, char element){
                 this.weight = weight;
                 this.element = element;
             }
             
         }
    }
}

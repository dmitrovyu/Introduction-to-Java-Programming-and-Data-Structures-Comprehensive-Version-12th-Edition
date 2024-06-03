/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercise_25_14;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author DEJAN
 */
public class BSTWithBFT<E>  extends BST{
    public void bredthFirstTraversal(){
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty()){
            //pool() removes the present root
            TreeNode tempNode = queue.poll();
            System.out.print( tempNode.element + " ");
            //enque left child
            if(tempNode.left != null)
                queue.add(tempNode.left);
            if(tempNode.right != null)
                queue.add(tempNode.right);   
        }
    }
    
}

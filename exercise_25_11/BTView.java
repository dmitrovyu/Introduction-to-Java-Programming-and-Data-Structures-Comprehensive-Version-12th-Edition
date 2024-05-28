
package com.mycompany.exercise_25_11;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

/**
 *
 * @author DEJAN
 */
public class BTView  extends Pane{
    private BST<Integer> tree = new BST<>();
    private double radius = 15; // TreeNode radius
    private double hGap = 50; //Horizontal gap between nodes
    
    public BTView(BST<Integer> tree){
        this.tree = tree;
        setStatus("Tree is Empty");
    }
    public void setStatus(String text){
        getChildren().add(new Text(20,20, text));
    }
    public void displayTree(){
        this.getChildren().clear();
        if(tree.getRoot() != null) {
            //Display tree recursively 
            displayTree(tree.getRoot(),hGap, getHeight()/2, getHeight()/4);

        }
    }
    //Display a subtree rooted on position (x,y)
    private void displayTree(BST.TreeNode<Integer> root, double x, double y, double vGap ){
        if(root.left !=null){
            //Draw a line to the left node
            getChildren().add(new Line(x+hGap, y+vGap, x,y));
            //Draw the left subtree recusively
            displayTree(root.left,x+hGap, y+vGap,vGap/2);
            
        }
        if(root.right != null){
            //Draw a line to the right node
            getChildren().add(new Line(x+hGap, y-vGap, x, y));
            //Draw the right subtree recusively
            displayTree(root.right, x+hGap,y-vGap, vGap/2);
        }
        //Display a node
        Circle circle = new Circle(x,y, radius);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        getChildren().addAll(circle,new Text(x-4,y+4,root.element+""));
    }
}

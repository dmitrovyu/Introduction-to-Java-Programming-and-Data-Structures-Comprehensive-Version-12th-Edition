package com.mycompany.exercise_26_01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import javafx.stage.Stage;


/**
 * (Display AVL tree graphically) Write a program that displays an AVL tree along 
 * with its balance factor for each node.
 * @author DejanD
 */

public class App extends Application {

    @Override
    public void start(Stage stage) {
        AVLTree<Integer> tree = new AVLTree<>(new Integer[]{124,3,5,7,34,11,24,136,15,29,58,205});
        
        
        BorderPane pane = new BorderPane();
        AVLPane avlPane = new AVLPane(tree);
        
        pane.setCenter(avlPane);
        Label lbl = new Label("Display AVL tree graphically). Write a program that displays an AVL tree along \n" +
        "with its balance factor for each node.");
        pane.setTop(lbl);
        
        
        
        var scene = new Scene(pane, 640, 480);
        
        stage.setTitle("Display AVL Tree");
        stage.setScene(scene);
        
        stage.show();
        avlPane.displayTree();
    }

    public static void main(String[] args) {
        launch();
    }

}
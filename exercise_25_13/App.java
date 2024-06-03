package com.mycompany.exercise_25_13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


/**
 * (Add new buttons in BSTAnimation) Modify Listing 25.8, BSTAnimation.java, 
 * to add three new buttons—Show Inorder, Show Preorder, and Show Postorder—
 * to display the result in a label, as shown in Figure 25.22. You need also to modify  
 * Listing 25.4, BST.java to implement the inorderList(), preorderList(), 
 * and postorderList() methods so each of these methods returns a List of 
 * the node elements in inorder, preorder, and postorder, as follows:
 * public java.util.List<E> inorderList();
 * public java.util.List<E> preorderList();
 * public java.util.List<E> postorderList()
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        BST<Integer> tree = new BST<>();
        BorderPane pane = new BorderPane();
        BTView view = new BTView(tree); //Create a view
        pane.setCenter(view);
        
        //Add label for showing inorder(),preorder(), postorder()
        Label lblResult = new Label("Show elements in inorder/preorder/postorder");
        BorderPane.setAlignment(lblResult, Pos.CENTER);
        pane.setTop(lblResult);
        
        
        //**
        
        
        TextField tfKey = new TextField();
        tfKey.setPrefColumnCount(3);
        tfKey.setAlignment(Pos.BASELINE_RIGHT);
        Button btnInsert = new Button("Insert");
        Button btnDelete = new Button("Delete");
        
        /** Add three new buttons for inorder(), preorder(), postorder()*/
        Button btnInorder = new Button("Show Inorder");
        Button btnPreorder = new Button("Show Preorder");
        Button btnPostorder = new Button("Shoe Postorder");
        //*****
        
        
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("Enter a key: "), tfKey, btnInsert,btnDelete,
                btnInorder,btnPreorder,btnPostorder);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);
        
        btnInsert.setOnAction(e-> {
            int key = Integer.parseInt(tfKey.getText());
            if (tree.search(key)) {// Key is already in the tree
                view.displayTree();
                view.setStatus(key + " is already in the tree");
            }
            else {
                tree.insert(key);
                view.displayTree();
                view.setStatus(key + " is inserted in the tree");
            }
        });
        
        btnDelete.setOnAction(e->{
            int key = Integer.parseInt(tfKey.getText());
            if (!tree.search(key)) { // key is not in the tree
                view.displayTree();
                view.setStatus(key + " is not in the tree");
            }
            else {
                tree.delete(key);
                view.displayTree();
                view.setStatus(key + " is deleted from the tree");
            }
            
        });
        
        btnInorder.setOnAction(e->{
            java.util.ArrayList<Integer> list = (java.util.ArrayList<Integer>) tree.inorderList();
            
            String result = "[" + list.get(0);
            for (int i =1; i <list.size(); i++)
                result = result + ", " + list.get(i) ;
            result += "]";
            lblResult.setText(result);
            
        });
        btnPostorder.setOnAction(e-> {
            java.util.ArrayList<Integer> list = (java.util.ArrayList<Integer>) tree.postorderList();
            
            String result = "[" + list.get(0);
            for (int i =1; i <list.size(); i++)
                result = result + ", " + list.get(i) ;
            result += "]";
            lblResult.setText(result);
        });
        
        btnPreorder.setOnAction(e->{
            java.util.ArrayList<Integer> list = (java.util.ArrayList<Integer>) tree.preorderList();
            tree.preorder();
            String result = "[" + list.get(0);
            for (int i =1; i <list.size(); i++)
                result = result + ", " + list.get(i) ;
            result += "]";
            lblResult.setText(result);
        });
        

        var scene = new Scene(pane,640,480);
        stage.setTitle("BSTAnimation");
        stage.setScene(scene);
        stage.show(); //Display the stage
    }

    public static void main(String[] args) {
        launch();
    }

}
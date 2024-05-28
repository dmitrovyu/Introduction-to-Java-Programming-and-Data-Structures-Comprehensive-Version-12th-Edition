package com.mycompany.exercise_25_11;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * (Display tree) Write a new view class that displays the tree horizontally with the 
 * root on the left as shown in Figure 25.21
 * @author 
 * @DejanDm
 * 
 */
public class Exercise_25_11 extends Application {

    @Override
    public void start(Stage stage) {
        BST<Integer> tree = new BST<>();
        BorderPane pane = new BorderPane();
        Label show = new Label();
        HBox showContainer = new HBox(show);
        showContainer.setAlignment(Pos.CENTER);
        pane.setTop(showContainer);
        
        BTView view = new BTView(tree); // create view
        pane.setCenter(view);
        
        TextField tfKey = new TextField();
        Button btnInsert = new Button("Insert");
        Button btnDelete = new Button("Delete");
        
        HBox hBox = new HBox();
        hBox.getChildren().addAll(new Label("Enter a key: "), tfKey,btnInsert,btnDelete);
        hBox.setAlignment(Pos.CENTER);
        pane.setBottom(hBox);
        
        btnInsert.setOnAction(e-> {
            int key = Integer.parseInt(tfKey.getText());
            if(tree.search(key)){
                //key is already in the tree
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
            if (!tree.search(key)){
                //key is not in the tree
                view.displayTree();
                view.setStatus(key + " is not in the tree");
            }
            else {
                tree.delete(key);
                view.displayTree();
                view.setStatus(key + " is deleted from the tree");   
            }
        });
        

        
        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
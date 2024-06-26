package com.mycompany.exercise_26_03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javafx.stage.Stage;

/**
 * (AVL tree animation) Write a program that animates the AVL tree insert,
 * delete, and search methods, as shown in Figure 26.2.
 *
 * @author DejanD
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        AVLTree<Integer> tree = new AVLTree<>();

        BorderPane pane = new BorderPane();
        AVLPane avlPane = new AVLPane(tree);

        pane.setCenter(avlPane);
        Label lbl = new Label("Usage: Enter an integer key and click Search button to search the key in the tree."
                + "Click the insert button to insert the key \n"
                + "into the tree. Click the Remove button to remove the key from the tree. For the best display, use the integers between 0 and 99");
 
        pane.setTop(lbl);
        BorderPane.setMargin(lbl, new Insets(10));

        Button btnSearch = new Button("Search");
        Button btnInsert = new Button("Insert");
        Button btnDelete = new Button("Delete");
        Label lblEnterKey = new Label("Enter a key");
        TextField txfInsertKey = new TextField();
        txfInsertKey.setPrefColumnCount(4);
        HBox hbox = new HBox(8);
        hbox.getChildren().addAll(lblEnterKey, txfInsertKey, btnSearch, btnInsert, btnDelete);
        hbox.setAlignment(Pos.CENTER);

        pane.setBottom(hbox);

        btnSearch.setOnAction(e -> {
            if (txfInsertKey.getText() != null) {
                int key = Integer.parseInt(txfInsertKey.getText());
                avlPane.displayTree();
                if (tree.search(key)) {
                    avlPane.setStatus("Result:The key " + key + " found in the tree");
                } else {
                    avlPane.setStatus("Result:The key " + key + " is not in the tree");
                }

            }
        });
        
        btnInsert.setOnAction(e->{
            int key = Integer.parseInt(txfInsertKey.getText());
            if (tree.search(key)){
                avlPane.displayTree();
                avlPane.setStatus("Result:The key " + key + " is already in tree");
            }else {
                tree.insert(key);
                avlPane.displayTree();
                avlPane.setStatus("Result:The key " + key + " inserted in the tree");
            }
        });
        
        btnDelete.setOnAction(e->{
            int key = Integer.parseInt(txfInsertKey.getText());
            if(tree.search(key)) {
                tree.delete(key);
                avlPane.displayTree();
                avlPane.setStatus("Result:The key " + key + " deleted from the tree");
            }
            else {
                avlPane.displayTree();
                avlPane.setStatus("Result:The key " + key + " was not in the tree");
            }
                
        });
        

        var scene = new Scene(pane, 840, 480);

        stage.setTitle("Display AVL Tree");
        stage.setScene(scene);

        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

}

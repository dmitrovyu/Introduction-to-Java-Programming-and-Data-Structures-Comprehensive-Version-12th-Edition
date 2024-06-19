package com.mycompany.exercise_25_17;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/* ***25.17 (Data compression: Huffman coding animation) Write a program that enables
 * the user to enter text and displays the Huffman coding tree based on the text, as
 * shown in Figure 25.21a. Display the weight of the subtree inside the subtree’s
 * root circle. Display each leaf node’s character. Display the encoded bits for
 * the text in a label. When the user clicks the Decode Text button, a bit string is
 * decoded into text displayed in the label, as shown in Figure 25.21b.
 *
 */
/**
 * JavaFX App
 * @DejanD
 */
public class App extends Application {
    public  HuffmanTree tree;

    @Override
    public void start(Stage stage) {
        Button btn_ShowTree = new Button("Show Huffman Tree");
        Button btn_DecodeText = new Button("Decode to Text");
        Label lbl_EnterText = new Label("Enter a text: ");
        Label lbl_EnterBit = new Label("Enter a bit String: ");
        Label lbl_Status = new Label("Encoded");
        TextField txf_EnterText = new TextField();
        TextField txf_EnterBit = new TextField();
        HBox hBoxOne = new HBox();
        hBoxOne.setAlignment(Pos.CENTER);
        hBoxOne.setSpacing(15);
        HBox hBoxTwo = new HBox();
        hBoxTwo.setAlignment(Pos.CENTER);
        hBoxTwo.setSpacing(15);
        hBoxOne.getChildren().addAll(lbl_EnterText,txf_EnterText, btn_ShowTree);
        hBoxTwo.getChildren().addAll(lbl_EnterBit,txf_EnterBit, btn_DecodeText);
        
        VBox box = new VBox();
        box.setSpacing(10);
        box.getChildren().addAll(hBoxOne,hBoxTwo);
       
        int[] counts = getCharacterFrequency("");
        tree = getHuffmanTree(counts);
        Pane huffmanTree = new TreeViewPane(tree, 500, 500);
        
        box.getChildren().addAll(huffmanTree, lbl_Status);
        box.setAlignment(Pos.CENTER);
        
        btn_ShowTree.setOnAction(e->{
            String originalString = txf_EnterText.getText();
            int[] countsAux = getCharacterFrequency(originalString);
            tree = getHuffmanTree(countsAux);
            box.getChildren().set(2, new TreeViewPane(tree, 500,500));
            lbl_Status.setText(originalString + " is encoded to " + getEncoded(originalString,tree));
            
        });
        
        btn_DecodeText.setOnAction(e->{
            String bitStringAux = txf_EnterBit.getText();
            lbl_Status.setText(bitStringAux + " is decoded to " + tree.decode(bitStringAux));
        });
        
        
        
        var scene = new Scene(box, 640, 480);
        stage.setScene(scene);
        stage.setTitle("Exercise 25.17.");
        stage.show();
    }
    
    public String getEncoded(String text, HuffmanTree tree)
    {
        String encoded = "";
        for (int i = 0; i < text.length(); i++)
            encoded += tree.getCode(text.charAt(i));
        return encoded;
    }
    
     public static HuffmanTree getHuffmanTree(int[] counts)
    {
        // Create a heap to hold trees
        Heap<HuffmanTree> heap = new Heap<>();
        for (int i = 0; i < counts.length; i++)
        {
            if (counts[i] > 0)
                heap.add(new HuffmanTree(counts[i], (char) i)); // A leaf node tree
        }

        while (heap.getSize() > 1)
        {
            HuffmanTree t1 = heap.remove(); // Remove the smallest−weight tree
            HuffmanTree t2 = heap.remove(); // Remove the next smallest
            heap.add(new HuffmanTree(t1, t2)); // Combine two trees
        }

        return heap.remove(); // The final tree
    }
     
     /**
     * Get the frequency of the characters
     */
    public static int[] getCharacterFrequency(String text)
    {
        int[] counts = new int[256]; // 256 ASCII characters

        for (int i = 0; i < text.length(); i++)
            counts[(int) text.charAt(i)]++; // Count the characters in text

        return counts;
    }



    public static void main(String[] args) {
        launch();
    }

}
package io.fp.caesarcipherfx;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class CaesarCipherUI extends Application {
    private TextField textfeld;
    private TextField key;
    private Label cipherOutput;
    private Button execute;
    private Button decipher;
    private Parent root;
    private CaesarCipher ceasercipher=new CaesarCipher();;
    public static void main(String[] args)
    {
        launch(args);
    }
    

    @Override 
    public void init()throws Exception
    {  
        textfeld= new TextField("Nachricht");
        key= new TextField("key");
        execute=new Button( "Encrypt Message");
        decipher=new Button("Decrypt Message");
        cipherOutput= new Label("yjxy");

        execute.setOnAction(e -> {
            try{
            cipherOutput.setText(ceasercipher.cipher(textfeld.getText(), Integer.parseInt(key.getText())));    

            }catch(Exception ex)
            {
                cipherOutput.setText( ex.getMessage());
            }
        });
        decipher.setOnAction(e -> {
            try{
            cipherOutput.setText(ceasercipher.decipher(textfeld.getText(), Integer.parseInt(key.getText())));    

            }catch(Exception ex)
            {
                cipherOutput.setText( ex.getMessage());
            }
        });
        root=createSceneGraph();
        
        
    }

    public Parent createSceneGraph()
    {   
        BorderPane root=new BorderPane();

        Button buttons[]={execute, decipher};
        FlowPane buttonUnten=new FlowPane();
        buttonUnten.setVgap(2);
        buttonUnten.setHgap(1);
        buttonUnten.setPrefWrapLength(300); 
        for (int i = 0; i < buttons.length; i++) {
            buttonUnten.getChildren().add(buttons[i]);
        }

        TextField texts[]={textfeld, key};
       
        FlowPane texteOben=new FlowPane();
        texteOben.setVgap(2);
        texteOben.setHgap(1);
        texteOben.setPrefWrapLength(300); 
        for (int i = 0; i < texts.length; i++) {
            texteOben.getChildren().add(texts[i]);
        }

        root.setBottom(buttonUnten);
        root.setTop(texteOben);
        root.setCenter(cipherOutput);
        return root;

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Casear Cipher");
        Scene scene=new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}

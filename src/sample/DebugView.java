package sample;

import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by mocha on 25/4/18.
 */
public class DebugView extends VBox {
    Text text, intro, text2,text3,text4, text5;
    BufferedReader br;

    public DebugView(){
        text = new Text(
                "Start by going to file -> create instructions" + "\n" +  "WARNING: Clicking that also acts as a function to CLEAR ALL CONTENTS IN FILE!!\n"  + "From L to R, the buttons below have the following functions:\n"+"1. Play/pause\n"+"2. Go To Previous Sequence\n"+"3. Add sequence to instruction.txt\n"+"4. Delete sequence at currentTime\n");
        intro = new Text("-INSTRUCTIONS-" +"\n");
        text2 = new Text("L1-L32 buttons allow you to decide what light channels to activate.\n" + "\n"
        + "After which, PRESS --> BUTTON BEFORE PRESSING F!!!" + "\n" + "REMEMBER!!!!!\n");
        text3 = new Text("Press Refresh to refresh display, whenever you change instructions or playback.\n" + "\n" + "After deleting sequences, press + to update!");
        text4 = new Text("-CONFIG SAVING-" + "\n");
        text5 = new Text("RESET - move all moved lights to original spot" + "\n" +
                "LOAD CFG - load configuration document" + "\n" +
                "SAVE CFG - save configurations to config.txt" + "\n"
        );
        setPadding(new Insets(5,10,5,10));
        text.setWrappingWidth(200);
        intro.setWrappingWidth(200);
        text2.setWrappingWidth(200);
        text3.setWrappingWidth(200);
        text4.setWrappingWidth(200);
        text5.setWrappingWidth(200);
        getChildren().add(intro);
        getChildren().add(text);
        getChildren().add(text2);
        getChildren().add(text3);
        getChildren().add(text4);
        getChildren().add(text5);
        //TODO print history
    }

    public void appendDebug(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("instructions.txt"));
            String write;
            while ((write = br.readLine()) != null) {
                String temp = text.getText();
                text.setText(temp + write);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}

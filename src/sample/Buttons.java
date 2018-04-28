package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.TilePane;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by mocha on 23/4/18.
 */
public class Buttons extends TilePane {

    CreateFile cf = new CreateFile();
    Map mp = new HashMap();

    public Buttons() {
        setPadding(new Insets(5, 10, 5, 10));


        //Variable initialisation
        ToggleButton tb1 = new ToggleButton("L1");
        ToggleButton tb2 = new ToggleButton("L2");
        ToggleButton tb3 = new ToggleButton("L3");
        ToggleButton tb4 = new ToggleButton("L4");
        ToggleButton tb5 = new ToggleButton("L5");
        ToggleButton tb6 = new ToggleButton("L6");
        ToggleButton tb7 = new ToggleButton("L7");
        ToggleButton tb8 = new ToggleButton("L8");
        ToggleButton tb9 = new ToggleButton("L9");
        ToggleButton tb10 = new ToggleButton("L10");
        ToggleButton tb11 = new ToggleButton("L11");
        ToggleButton tb12 = new ToggleButton("L12");
        ToggleButton tb13 = new ToggleButton("L13");
        ToggleButton tb14 = new ToggleButton("L14");
        ToggleButton tb15 = new ToggleButton("L15");
        ToggleButton tb16 = new ToggleButton("L16");
        ToggleButton tb17 = new ToggleButton("L17");
        ToggleButton tb18 = new ToggleButton("L18");
        ToggleButton tb19 = new ToggleButton("L19");
        ToggleButton tb20 = new ToggleButton("L20");
        ToggleButton tb21 = new ToggleButton("L21");
        ToggleButton tb22 = new ToggleButton("L22");
        ToggleButton tb23 = new ToggleButton("L23");
        ToggleButton tb24 = new ToggleButton("L24");
        ToggleButton tb25 = new ToggleButton("L25");
        ToggleButton tb26 = new ToggleButton("L26");
        ToggleButton tb27 = new ToggleButton("L27");
        ToggleButton tb28 = new ToggleButton("L28");
        ToggleButton tb29 = new ToggleButton("L29");
        ToggleButton tb30 = new ToggleButton("L30");
        ToggleButton tb31 = new ToggleButton("L31");
        ToggleButton tb32 = new ToggleButton("L32");
        Button set = new Button("-->");

        //button width setting
        tb1.setPrefWidth(50);
        tb2.setPrefWidth(50);
        tb3.setPrefWidth(50);
        tb4.setPrefWidth(50);
        tb5.setPrefWidth(50);
        tb6.setPrefWidth(50);
        tb7.setPrefWidth(50);
        tb8.setPrefWidth(50);
        tb9.setPrefWidth(50);
        tb10.setPrefWidth(50);
        tb11.setPrefWidth(50);
        tb12.setPrefWidth(50);
        tb13.setPrefWidth(50);
        tb14.setPrefWidth(50);
        tb15.setPrefWidth(50);
        tb16.setPrefWidth(50);
        tb17.setPrefWidth(50);
        tb18.setPrefWidth(50);
        tb19.setPrefWidth(50);
        tb20.setPrefWidth(50);
        tb21.setPrefWidth(50);
        tb22.setPrefWidth(50);
        tb23.setPrefWidth(50);
        tb24.setPrefWidth(50);
        tb25.setPrefWidth(50);
        tb26.setPrefWidth(50);
        tb27.setPrefWidth(50);
        tb28.setPrefWidth(50);
        tb29.setPrefWidth(50);
        tb30.setPrefWidth(50);
        tb31.setPrefWidth(50);
        tb32.setPrefWidth(50);
        set.setPrefWidth(50);

        //adding to the menu
        getChildren().add(tb1);
        getChildren().add(tb2);
        getChildren().add(tb3);
        getChildren().add(tb4);
        getChildren().add(tb5);
        getChildren().add(tb6);
        getChildren().add(tb7);
        getChildren().add(tb8);
        getChildren().add(tb9);
        getChildren().add(tb10);
        getChildren().add(tb11);
        getChildren().add(tb12);
        getChildren().add(tb13);
        getChildren().add(tb14);
        getChildren().add(tb15);
        getChildren().add(tb16);
        getChildren().add(tb17);
        getChildren().add(tb18);
        getChildren().add(tb19);
        getChildren().add(tb20);
        getChildren().add(tb21);
        getChildren().add(tb22);
        getChildren().add(tb23);
        getChildren().add(tb24);
        getChildren().add(tb25);
        getChildren().add(tb26);
        getChildren().add(tb27);
        getChildren().add(tb28);
        getChildren().add(tb29);
        getChildren().add(tb30);
        getChildren().add(tb31);
        getChildren().add(tb32);
        getChildren().add(set);

        //FUNCTIONS

        //TODO ALL OTHER BUTTONS

        tb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb1.isSelected()){
                    //cf.appendData("Test");
                    mp.put(1,1);
                    //tb1.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
                    try {
                        //cf.appendTemp("1 " + mp.get(1).toString());
                        System.out.println("1 " + mp.get(1).toString());
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }else{
                    mp.put(1,0);
                    //tb1.setStyle("-fx-background-color:transparent;\n" + "-fx-border-color:black");
                    try {
                        //cf.appendTemp("1 " + mp.get(1).toString());
                        System.out.println("1 " + mp.get(1).toString());
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        tb2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb2.isSelected()){
                    //cf.appendData("Test");
                    mp.put(2,1);
                    //tb1.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
                    try {
                        //cf.appendTemp("1 " + mp.get(1).toString());
                        System.out.println("2 " + mp.get(2).toString());
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }else{
                    mp.put(2,0);
                    //tb1.setStyle("-fx-background-color:transparent;\n" + "-fx-border-color:black");
                    try {
                        //cf.appendTemp("1 " + mp.get(1).toString());
                        System.out.println("2 " + mp.get(2).toString());
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                }
            }
        });
        tb3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb3.isSelected()){
                    mp.put(3,1);
                }else{
                    mp.put(3,0);
                }
            }
        });
        tb4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb4.isSelected()){
                    mp.put(4,1);
                }else{
                    mp.put(4,0);
                }
            }
        });
        tb5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb5.isSelected()){
                    mp.put(5,1);
                }else{
                    mp.put(5,0);
                }
            }
        });
        tb6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb6.isSelected()){
                    mp.put(6,1);
                }else{
                    mp.put(6,0);
                }
            }
        });
        tb7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb7.isSelected()){
                    mp.put(7,1);
                }else{
                    mp.put(7,0);
                }
            }
        });
        tb8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb8.isSelected()){
                    mp.put(8,1);
                }else{
                    mp.put(8,0);
                }
            }
        });
        tb9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb9.isSelected()){
                    mp.put(9,1);
                }else{
                    mp.put(9,0);
                }
            }
        });
        tb10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb10.isSelected()){
                    mp.put(10,1);
                }else{
                    mp.put(10,0);
                }
            }
        });

        tb11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb11.isSelected()){
                    mp.put(11,1);
                }else{
                    mp.put(11,0);
                }
            }
        });
        tb12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb12.isSelected()){
                    mp.put(12,1);
                }else{
                    mp.put(12,0);
                }
            }
        });
        tb13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb13.isSelected()){
                    mp.put(13,1);
                }else{
                    mp.put(13,0);
                }
            }
        });
        tb14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb14.isSelected()){
                    mp.put(14,1);

                }else{
                    mp.put(14,0);
                }
            }
        });
        tb15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb15.isSelected()){
                    mp.put(15,1);
                }else{
                    mp.put(15,0);
                }
            }
        });
        tb16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb16.isSelected()){
                    mp.put(16,1);
                }else{
                    mp.put(16,0);
                }
            }
        });
        tb17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb17.isSelected()){
                    mp.put(17,1);
                }else{
                    mp.put(17,0);
                }
            }
        });
        tb18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb18.isSelected()){
                    mp.put(18,1);
                }else{
                    mp.put(18,0);
                }
            }
        });
        tb19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb19.isSelected()){
                    mp.put(19,1);
                }else{
                    mp.put(19,0);
                }
            }
        });
        tb20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb20.isSelected()){
                    mp.put(20,1);
                }else{
                    mp.put(20,0);
                }
            }
        });

        tb21.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb21.isSelected()){
                    mp.put(21,1);
                }else{
                    mp.put(21,0);
                }
            }
        });
        tb22.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb22.isSelected()){
                    mp.put(22,1);
                }else{
                    mp.put(22,0);
                }
            }
        });
        tb23.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb23.isSelected()){
                    mp.put(23,1);
                }else{
                    mp.put(23,0);
                }
            }
        });
        tb24.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb24.isSelected()){
                    mp.put(24,1);
                }else{
                    mp.put(24,0);
                }
            }
        });
        tb25.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb25.isSelected()){
                    mp.put(25,1);
                }else{
                    mp.put(25,0);
                }
            }
        });
        tb26.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb26.isSelected()){
                    mp.put(26,1);
                }else{
                    mp.put(26,0);
                }
            }
        });
        tb27.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb27.isSelected()){
                    mp.put(27,1);
                }else{
                    mp.put(27,0);
                }
            }
        });
        tb28.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb28.isSelected()){
                    mp.put(28,1);
                }else{
                    mp.put(28,0);
                }
            }
        });
        tb29.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb29.isSelected()){
                    mp.put(29,1);
                }else{
                    mp.put(29,0);
                }
            }
        });
        tb30.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb30.isSelected()){
                    mp.put(30,1);
                }else{
                    mp.put(30,0);
                }
            }
        });
        tb31.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb31.isSelected()){
                    mp.put(31,1);
                }else{
                    mp.put(31,0);
                }
            }
        });
        tb32.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if(tb32.isSelected()){
                    mp.put(32,1);
                }else{
                    mp.put(32,0);
                }
            }
        });

        //CONFIRM function
        set.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    System.out.println("--DEBUG--");
                    for(int i = 1; i < 32; i++){
                        if(mp.get(i)!= null){
                            cf.appendTemp(i + " " + mp.get(i).toString()); // append no need newline
                            System.out.println(i + " " + mp.get(i).toString());
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }



    public void writeStuff(String time) throws IOException {

        try {
            BufferedReader br = new BufferedReader(new FileReader("buffer.tmp"));
            String write;
            while ((write = br.readLine()) != null) {
                cf.appendData(time + " " + write);
            }

            System.out.println("Appended at " + time);
            //Clear temp file
            PrintWriter pw = new PrintWriter("buffer.tmp");
            pw.close();
            br.close();

        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

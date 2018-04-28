package sample;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;
import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.util.Pair;

import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by mocha on 25/4/18.
 */
public class SpectrumView extends Pane {

    CreateFile cf = new CreateFile();
    //Variable initialisation
    Button tb1 = new Button("L1");
    Button tb2 = new Button("L2");
    Button tb3 = new Button("L3");
    Button tb4 = new Button("L4");
    Button tb5 = new Button("L5");
    Button tb6 = new Button("L6");
    Button tb7 = new Button("L7");
    Button tb8 = new Button("L8");
    Button tb9 = new Button("L9");
    Button tb10 = new Button("L10");
    Button tb11 = new Button("L11");
    Button tb12 = new Button("L12");
    Button tb13 = new Button("L13");
    Button tb14 = new Button("L14");
    Button tb15 = new Button("L15");
    Button tb16 = new Button("L16");
    Button tb17 = new Button("L17");
    Button tb18 = new Button("L18");
    Button tb19 = new Button("L19");
    Button tb20 = new Button("L20");
    Button tb21 = new Button("L21");
    Button tb22 = new Button("L22");
    Button tb23 = new Button("L23");
    Button tb24 = new Button("L24");
    Button tb25 = new Button("L25");
    Button tb26 = new Button("L26");
    Button tb27 = new Button("L27");
    Button tb28 = new Button("L28");
    Button tb29 = new Button("L29");
    Button tb30 = new Button("L30");
    Button tb31 = new Button("L31");
    Button tb32 = new Button("L32");
    Button refresh = new Button("REFRESH");
    Button reset = new Button("RESET");
    Button save = new Button("SAVE CFG");
    Button load = new Button("LOAD CFG");

    MediaPlayer player;
    Integer currenttime;
    int[][] lanternstates = new int[10000][3];
    int[] time = new int[10000];
    Integer count = 0;
    Integer cue = 0;
    int binary = 0;

    Map<Integer,Double> mapx = new HashMap<>();
    Map<Integer,Double> mapy = new HashMap<>();

    public SpectrumView(MediaPlayer play) {
        player = play;

        tb1.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb2.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb3.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb4.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb5.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb6.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb7.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb8.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb9.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb10.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb11.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb12.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb13.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb14.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb15.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb16.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb17.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb18.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb19.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb20.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb21.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb22.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb23.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb24.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb25.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb26.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb27.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb28.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb29.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb30.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb31.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        tb32.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");

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
        refresh.setPrefWidth(100);
        reset.setPrefWidth(100);
        save.setPrefWidth(100);
        load.setPrefWidth(100);

        //ALL X LAYOUTS
        tb1.setLayoutX(100);
        tb2.setLayoutX(150);
        tb3.setLayoutX(200);
        tb4.setLayoutX(250);
        tb5.setLayoutX(300);
        tb6.setLayoutX(350);
        tb7.setLayoutX(400);
        tb8.setLayoutX(450);

        tb9.setLayoutX(100);
        tb10.setLayoutX(150);
        tb11.setLayoutX(200);
        tb12.setLayoutX(250);
        tb13.setLayoutX(300);
        tb14.setLayoutX(350);
        tb15.setLayoutX(400);
        tb16.setLayoutX(450);

        tb17.setLayoutX(100);
        tb18.setLayoutX(150);
        tb19.setLayoutX(200);
        tb20.setLayoutX(250);
        tb21.setLayoutX(300);
        tb22.setLayoutX(350);
        tb23.setLayoutX(400);
        tb24.setLayoutX(450);

        tb25.setLayoutX(100);
        tb26.setLayoutX(150);
        tb27.setLayoutX(200);
        tb28.setLayoutX(250);
        tb29.setLayoutX(300);
        tb30.setLayoutX(350);
        tb31.setLayoutX(400);
        tb32.setLayoutX(450);

        //ALL Y LAYOUTS
        tb9.setLayoutY(30);
        tb10.setLayoutY(30);
        tb11.setLayoutY(30);
        tb12.setLayoutY(30);
        tb13.setLayoutY(30);
        tb14.setLayoutY(30);
        tb15.setLayoutY(30);
        tb16.setLayoutY(30);

        tb17.setLayoutY(60);
        tb18.setLayoutY(60);
        tb19.setLayoutY(60);
        tb20.setLayoutY(60);
        tb21.setLayoutY(60);
        tb22.setLayoutY(60);
        tb23.setLayoutY(60);
        tb24.setLayoutY(60);

        tb25.setLayoutY(90);
        tb26.setLayoutY(90);
        tb27.setLayoutY(90);
        tb28.setLayoutY(90);
        tb29.setLayoutY(90);
        tb30.setLayoutY(90);
        tb31.setLayoutY(90);
        tb32.setLayoutY(90);
        reset.setLayoutY(30);
        save.setLayoutY(60);
        load.setLayoutY(90);

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
        getChildren().add(refresh);
        getChildren().add(reset);
        getChildren().add(save);
        getChildren().add(load);

        int i = 0;
        for(int g = 0; g <= 4; g++){
            mapx.put(i,100.0);
            mapx.put(i+1,150.0);
            mapx.put(i+2,200.0);
            mapx.put(i+3,250.0);
            mapx.put(i+4,300.0);
            mapx.put(i+5,350.0);
            mapx.put(i+6,400.0);
            mapx.put(i+7,450.0);
            i+= 8;
        }

        for(int k = 0; k < 8; k++){
            mapy.put(k, 0.0);
        }
        for(int k = 0; k < 8; k++){
            mapy.put(k+8, 30.0);
        }
        for(int k = 0; k < 8; k++){
            mapy.put(k+16, 60.0);
        }
        for(int k = 0; k < 8; k++){
            mapy.put(k+24, 90.0);
        }

        try{
            Scanner scan = new Scanner(new File("config.txt"));
            while(scan.hasNext()){
                String line = scan.nextLine().toLowerCase();
                Integer number = new Integer(line.substring(0, line.indexOf(" "))); //no
                Double x = new Double(line.split("\\s+")[1]); //X
                Double y = new Double(line.split("\\s+")[2]); //Y
                setPosition(number,x,y);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        //TODO Load conifg
        load.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    Scanner scan = new Scanner(new File("config.txt"));
                    while(scan.hasNext()){
                        String line = scan.nextLine().toLowerCase();
                        Integer number = new Integer(line.substring(0, line.indexOf(" "))); //no
                        Double x = new Double(line.split("\\s+")[1]); //X
                        Double y = new Double(line.split("\\s+")[2]); //Y
                        setPosition(number,x,y);
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

        //RESET Fx
        reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //ALL X LAYOUTS
                tb1.setLayoutX(100);
                tb2.setLayoutX(150);
                tb3.setLayoutX(200);
                tb4.setLayoutX(250);
                tb5.setLayoutX(300);
                tb6.setLayoutX(350);
                tb7.setLayoutX(400);
                tb8.setLayoutX(450);

                tb9.setLayoutX(100);
                tb10.setLayoutX(150);
                tb11.setLayoutX(200);
                tb12.setLayoutX(250);
                tb13.setLayoutX(300);
                tb14.setLayoutX(350);
                tb15.setLayoutX(400);
                tb16.setLayoutX(450);

                tb17.setLayoutX(100);
                tb18.setLayoutX(150);
                tb19.setLayoutX(200);
                tb20.setLayoutX(250);
                tb21.setLayoutX(300);
                tb22.setLayoutX(350);
                tb23.setLayoutX(400);
                tb24.setLayoutX(450);

                tb25.setLayoutX(100);
                tb26.setLayoutX(150);
                tb27.setLayoutX(200);
                tb28.setLayoutX(250);
                tb29.setLayoutX(300);
                tb30.setLayoutX(350);
                tb31.setLayoutX(400);
                tb32.setLayoutX(450);

                //ALL Y LAYOUTS
                tb1.setLayoutY(0);
                tb2.setLayoutY(0);
                tb3.setLayoutY(0);
                tb4.setLayoutY(0);
                tb5.setLayoutY(0);
                tb6.setLayoutY(0);
                tb7.setLayoutY(0);
                tb8.setLayoutY(0);

                tb9.setLayoutY(30);
                tb10.setLayoutY(30);
                tb11.setLayoutY(30);
                tb12.setLayoutY(30);
                tb13.setLayoutY(30);
                tb14.setLayoutY(30);
                tb15.setLayoutY(30);
                tb16.setLayoutY(30);

                tb17.setLayoutY(60);
                tb18.setLayoutY(60);
                tb19.setLayoutY(60);
                tb20.setLayoutY(60);
                tb21.setLayoutY(60);
                tb22.setLayoutY(60);
                tb23.setLayoutY(60);
                tb24.setLayoutY(60);

                tb25.setLayoutY(90);
                tb26.setLayoutY(90);
                tb27.setLayoutY(90);
                tb28.setLayoutY(90);
                tb29.setLayoutY(90);
                tb30.setLayoutY(90);
                tb31.setLayoutY(90);
                tb32.setLayoutY(90);
            }
        });

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    cf.refreshConfig();
                    for(int i = 0; i <= mapx.size(); i++){
                        if(mapx.get(i) !=null && mapy.get(i) != null){
                            cf.appendConfig(i+1 + " " + mapx.get(i).toString() + " " + mapy.get(i).toString());
                        }
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }

            }
        });

        tb1.setOnMouseDragged(e -> {
            tb1.setLayoutX(e.getSceneX());
            tb1.setLayoutY(e.getSceneY());
            mapx.put(0,e.getSceneX());
            mapy.put(0,e.getSceneY());
        });
        tb2.setOnMouseDragged(e -> {
            tb2.setLayoutX(e.getSceneX());
            tb2.setLayoutY(e.getSceneY());
            mapx.put(1,e.getSceneX());
            mapy.put(1,e.getSceneY());
        });
        tb3.setOnMouseDragged(e -> {
            tb3.setLayoutX(e.getSceneX());
            tb3.setLayoutY(e.getSceneY());
            mapx.put(2,e.getSceneX());
            mapy.put(2,e.getSceneY());
        });
        tb4.setOnMouseDragged(e -> {
            tb4.setLayoutX(e.getSceneX());
            tb4.setLayoutY(e.getSceneY());
            mapx.put(3,e.getSceneX());
            mapy.put(3,e.getSceneY());
        });
        tb5.setOnMouseDragged(e -> {
            tb5.setLayoutX(e.getSceneX());
            tb5.setLayoutY(e.getSceneY());
            mapx.put(4,e.getSceneX());
            mapy.put(4,e.getSceneY());
        });
        tb6.setOnMouseDragged(e -> {
            tb6.setLayoutX(e.getSceneX());
            tb6.setLayoutY(e.getSceneY());
            mapx.put(5,e.getSceneX());
            mapy.put(5,e.getSceneY());
        });
        tb7.setOnMouseDragged(e -> {
            tb7.setLayoutX(e.getSceneX());
            tb7.setLayoutY(e.getSceneY());
            mapx.put(6,e.getSceneX());
            mapy.put(6,e.getSceneY());
        });
        tb8.setOnMouseDragged(e -> {
            tb8.setLayoutX(e.getSceneX());
            tb8.setLayoutY(e.getSceneY());
            mapx.put(7,e.getSceneX());
            mapy.put(7,e.getSceneY());
        });
        tb9.setOnMouseDragged(e -> {
            tb9.setLayoutX(e.getSceneX());
            tb9.setLayoutY(e.getSceneY());
            mapx.put(8,e.getSceneX());
            mapy.put(8,e.getSceneY());
        });
        tb10.setOnMouseDragged(e -> {
            tb10.setLayoutX(e.getSceneX());
            tb10.setLayoutY(e.getSceneY());
            mapx.put(9,e.getSceneX());
            mapy.put(9,e.getSceneY());
        });

        //NEXT 10-20

        tb11.setOnMouseDragged(e -> {
            tb11.setLayoutX(e.getSceneX());
            tb11.setLayoutY(e.getSceneY());
            mapx.put(10,e.getSceneX());
            mapy.put(10,e.getSceneY());
        });
        tb12.setOnMouseDragged(e -> {
            tb12.setLayoutX(e.getSceneX());
            tb12.setLayoutY(e.getSceneY());
            mapx.put(11,e.getSceneX());
            mapy.put(11,e.getSceneY());
        });
        tb13.setOnMouseDragged(e -> {
            tb13.setLayoutX(e.getSceneX());
            tb13.setLayoutY(e.getSceneY());
            mapx.put(12,e.getSceneX());
            mapy.put(12,e.getSceneY());
        });
        tb14.setOnMouseDragged(e -> {
            tb14.setLayoutX(e.getSceneX());
            tb14.setLayoutY(e.getSceneY());
            mapx.put(13,e.getSceneX());
            mapy.put(13,e.getSceneY());
        });
        tb15.setOnMouseDragged(e -> {
            tb15.setLayoutX(e.getSceneX());
            tb15.setLayoutY(e.getSceneY());
            mapx.put(14,e.getSceneX());
            mapy.put(14,e.getSceneY());
        });
        tb16.setOnMouseDragged(e -> {
            tb16.setLayoutX(e.getSceneX());
            tb16.setLayoutY(e.getSceneY());
            mapx.put(15,e.getSceneX());
            mapy.put(15,e.getSceneY());
        });
        tb17.setOnMouseDragged(e -> {
            tb17.setLayoutX(e.getSceneX());
            tb17.setLayoutY(e.getSceneY());
            mapx.put(16,e.getSceneX());
            mapy.put(16,e.getSceneY());
        });
        tb18.setOnMouseDragged(e -> {
            tb18.setLayoutX(e.getSceneX());
            tb18.setLayoutY(e.getSceneY());
            mapx.put(17,e.getSceneX());
            mapy.put(17,e.getSceneY());
        });
        tb19.setOnMouseDragged(e -> {
            tb19.setLayoutX(e.getSceneX());
            tb19.setLayoutY(e.getSceneY());
            mapx.put(18,e.getSceneX());
            mapy.put(18,e.getSceneY());
        });
        tb20.setOnMouseDragged(e -> {
            tb20.setLayoutX(e.getSceneX());
            tb20.setLayoutY(e.getSceneY());
            mapx.put(19,e.getSceneX());
            mapy.put(19,e.getSceneY());
        });

        //NEXT 20-32
        tb21.setOnMouseDragged(e -> {
            tb21.setLayoutX(e.getSceneX());
            tb21.setLayoutY(e.getSceneY());
            mapx.put(20,e.getSceneX());
            mapy.put(20,e.getSceneY());
        });
        tb22.setOnMouseDragged(e -> {
            tb22.setLayoutX(e.getSceneX());
            tb22.setLayoutY(e.getSceneY());
            mapx.put(21,e.getSceneX());
            mapy.put(21,e.getSceneY());
        });
        tb23.setOnMouseDragged(e -> {
            tb23.setLayoutX(e.getSceneX());
            tb23.setLayoutY(e.getSceneY());
            mapx.put(22,e.getSceneX());
            mapy.put(22,e.getSceneY());
        });
        tb24.setOnMouseDragged(e -> {
            tb24.setLayoutX(e.getSceneX());
            tb24.setLayoutY(e.getSceneY());
            mapx.put(23,e.getSceneX());
            mapy.put(23,e.getSceneY());
        });
        tb25.setOnMouseDragged(e -> {
            tb25.setLayoutX(e.getSceneX());
            tb25.setLayoutY(e.getSceneY());
            mapx.put(24,e.getSceneX());
            mapy.put(24,e.getSceneY());
        });
        tb26.setOnMouseDragged(e -> {
            tb26.setLayoutX(e.getSceneX());
            tb26.setLayoutY(e.getSceneY());
            mapx.put(25,e.getSceneX());
            mapy.put(25,e.getSceneY());
        });
        tb27.setOnMouseDragged(e -> {
            tb27.setLayoutX(e.getSceneX());
            tb27.setLayoutY(e.getSceneY());
            mapx.put(26,e.getSceneX());
            mapy.put(26,e.getSceneY());
        });
        tb28.setOnMouseDragged(e -> {
            tb28.setLayoutX(e.getSceneX());
            tb28.setLayoutY(e.getSceneY());
            mapx.put(27,e.getSceneX());
            mapy.put(27,e.getSceneY());
        });
        tb29.setOnMouseDragged(e -> {
            tb29.setLayoutX(e.getSceneX());
            tb29.setLayoutY(e.getSceneY());
            mapx.put(28,e.getSceneX());
            mapy.put(28,e.getSceneY());
        });
        tb30.setOnMouseDragged(e -> {
            tb30.setLayoutX(e.getSceneX());
            tb30.setLayoutY(e.getSceneY());
            mapx.put(29,e.getSceneX());
            mapy.put(29,e.getSceneY());
        });

        tb31.setOnMouseDragged(e -> {
            tb31.setLayoutX(e.getSceneX());
            tb31.setLayoutY(e.getSceneY());
            mapx.put(30,e.getSceneX());
            mapy.put(30,e.getSceneY());
        });
        tb32.setOnMouseDragged(e -> {
            tb32.setLayoutX(e.getSceneX());
            tb32.setLayoutY(e.getSceneY());
            mapx.put(31,e.getSceneX());
            mapy.put(31,e.getSceneY());
        });


        //READ INSTRUCTIONS AUTO ONCE UPON INITIALISATION
        try{
            Scanner scan = new Scanner(new File("instructions.txt"));
            while(scan.hasNext()){
                String line = scan.nextLine().toLowerCase();
                Integer time1 = new Integer(line.substring(0, line.indexOf(" ")));
                Integer time2 = new Integer(line.split("\\s+")[1]); //lantern
                Integer time3 = new Integer(line.split("\\s+")[2]); //state
                //System.out.println(time3);
                //mp.put(time1, time2.toString() + " " + time3.toString());
                lanternstates[count][0] = time1; //time
                lanternstates[count][1] = time2; //lantern
                lanternstates[count][2] = time3; //state
                time[count] = time1;
                count++;
            }
            Arrays.sort(time,0,count);
            //System.out.println(lanternstates[1][1]);
        } catch (IOException e){
            e.printStackTrace();
        }

        player.currentTimeProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                updatesValue();
            }
        });

        refresh.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                count = 0;
                if(binary == -1){
                    cue = 0;
                }else if(binary < 0){
                    cue = -(binary+2);
                }else{
                    cue = binary;
                }


                //RESET
                tb1.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb2.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb3.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb4.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb5.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb6.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb7.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb8.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb9.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb10.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb11.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb12.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb13.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb14.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb15.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb16.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb17.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb18.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb19.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb20.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb21.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb22.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb23.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb24.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb25.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb26.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb27.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb28.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb29.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb30.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb31.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
                tb32.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");

                try{
                    Scanner scan = new Scanner(new File("instructions.txt"));
                    while(scan.hasNext()){
                        String line = scan.nextLine().toLowerCase();
                        Integer time1 = new Integer(line.substring(0, line.indexOf(" ")));
                        Integer time2 = new Integer(line.split("\\s+")[1]); //lantern
                        Integer time3 = new Integer(line.split("\\s+")[2]); //state
                        lanternstates[count][0] = time1; //time
                        lanternstates[count][1] = time2; //lantern
                        lanternstates[count][2] = time3; //state
                        time[count] = time1;
                        count++;
                    }
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        });

    }

    public void setLantern(Integer lantern, Integer state){
        if(lantern == 1 && state == 1){
            tb1.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 1 && state == 0){
            tb1.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 2 && state == 1){
            tb2.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 2 && state == 0){
            tb2.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 3 && state == 1){
            tb3.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 3 && state == 0){
            tb3.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 4 && state == 1){
            tb4.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 4 && state == 0){
            tb4.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 5 && state == 1){
            tb5.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 5 && state == 0){
            tb5.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 6 && state == 1){
            tb6.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 6 && state == 0){
            tb6.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 7 && state == 1){
            tb7.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 7 && state == 0){
            tb7.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 8 && state == 1){
            tb8.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 8 && state == 0){
            tb8.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 9 && state == 1){
            tb9.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 9 && state == 0){
            tb9.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 10 && state == 1){
            tb10.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 10 && state == 0){
            tb10.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 11 && state == 1){
            tb11.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 11 && state == 0){
            tb11.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 12 && state == 1){
            tb12.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 12 && state == 0){
            tb12.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 13 && state == 1){
            tb13.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 13 && state == 0){
            tb13.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 14 && state == 1){
            tb14.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 14 && state == 0){
            tb14.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 15 && state == 1){
            tb15.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 15 && state == 0){
            tb15.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 16 && state == 1){
            tb16.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 16 && state == 0){
            tb16.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 17 && state == 1){
            tb17.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 17 && state == 0){
            tb17.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 18 && state == 1){
            tb18.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 18 && state == 0){
            tb18.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 19 && state == 1){
            tb19.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 19 && state == 0){
            tb19.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 20 && state == 1){
            tb20.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 20 && state == 0){
            tb20.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 21 && state == 1){
            tb21.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 21 && state == 0){
            tb21.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 22 && state == 1){
            tb22.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 22 && state == 0){
            tb22.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 23 && state == 1){
            tb23.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 23 && state == 0){
            tb23.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 24 && state == 1){
            tb24.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 24 && state == 0){
            tb24.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 25 && state == 1){
            tb25.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 25 && state == 0){
            tb25.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 26 && state == 1){
            tb26.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 26 && state == 0){
            tb26.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 27 && state == 1){
            tb27.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 27 && state == 0){
            tb27.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 28 && state == 1){
            tb28.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 28 && state == 0){
            tb28.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 29 && state == 1){
            tb29.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 29 && state == 0){
            tb29.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 30 && state == 1){
            tb30.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 30 && state == 0){
            tb30.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 31 && state == 1){
            tb31.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 31 && state == 0){
            tb31.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }
        if(lantern == 32 && state == 1){
            tb32.setStyle("-fx-background-color:yellow;\n" + "-fx-border-color:black");
        }
        if(lantern == 32 && state == 0){
            tb32.setStyle("-fx-background-color:white;\n" + "-fx-border-color:black");
        }

    }

    public void setPosition(Integer lantern, Double x, Double y){
        if(lantern == 1){
            tb1.setLayoutX(x);
            tb1.setLayoutY(y);
        }
        if(lantern == 2){
            tb2.setLayoutX(x);
            tb2.setLayoutY(y);
        }
        if(lantern == 3){
            tb3.setLayoutX(x);
            tb3.setLayoutY(y);
        }
        if(lantern == 4){
            tb4.setLayoutX(x);
            tb4.setLayoutY(y);
        }
        if(lantern == 5){
            tb5.setLayoutX(x);
            tb5.setLayoutY(y);
        }
        if(lantern == 6){
            tb6.setLayoutX(x);
            tb6.setLayoutY(y);
        }
        if(lantern == 7){
            tb7.setLayoutX(x);
            tb7.setLayoutY(y);
        }
        if(lantern == 8){
            tb8.setLayoutX(x);
            tb8.setLayoutY(y);
        }
        if(lantern == 9){
            tb9.setLayoutX(x);
            tb9.setLayoutY(y);
        }
        if(lantern == 10){
            tb10.setLayoutX(x);
            tb10.setLayoutY(y);
        }
        if(lantern == 11){
            tb11.setLayoutX(x);
            tb11.setLayoutY(y);
        }
        if(lantern == 12){
            tb12.setLayoutX(x);
            tb12.setLayoutY(y);
        }
        if(lantern == 13){
            tb13.setLayoutX(x);
            tb13.setLayoutY(y);
        }
        if(lantern == 14){
            tb14.setLayoutX(x);
            tb14.setLayoutY(y);
        }
        if(lantern == 15 ){
            tb15.setLayoutX(x);
            tb15.setLayoutY(y);
        }
        if(lantern == 16){
            tb16.setLayoutX(x);
            tb16.setLayoutY(y);
        }
        if(lantern == 17){
            tb17.setLayoutX(x);
            tb17.setLayoutY(y);
        }
        if(lantern == 18){
            tb18.setLayoutX(x);
            tb18.setLayoutY(y);
        }
        if(lantern == 19){
            tb19.setLayoutX(x);
            tb19.setLayoutY(y);
        }
        if(lantern == 20){
            tb20.setLayoutX(x);
            tb20.setLayoutY(y);
        }
        if(lantern == 21){
            tb21.setLayoutX(x);
            tb21.setLayoutY(y);
        }
        if(lantern == 22){
            tb22.setLayoutX(x);
            tb22.setLayoutY(y);
        }
        if(lantern == 23){
            tb23.setLayoutX(x);
            tb23.setLayoutY(y);
        }
        if(lantern == 24){
            tb24.setLayoutX(x);
            tb24.setLayoutY(y);
        }
        if(lantern == 25){
            tb25.setLayoutX(x);
            tb25.setLayoutY(y);
        }
        if(lantern == 26){
            tb26.setLayoutX(x);
            tb26.setLayoutY(y);
        }
        if(lantern == 27){
            tb27.setLayoutX(x);
            tb27.setLayoutY(y);
        }
        if(lantern == 28){
            tb28.setLayoutX(x);
            tb28.setLayoutY(y);
        }
        if(lantern == 29){
            tb29.setLayoutX(x);
            tb29.setLayoutY(y);
        }
        if(lantern == 30){
            tb30.setLayoutX(x);
            tb30.setLayoutY(y);
        }
        if(lantern == 31){
            tb31.setLayoutX(x);
            tb31.setLayoutY(y);
        }
        if(lantern == 32){
            tb32.setLayoutX(x);
            tb32.setLayoutY(y);
        }
    }

    protected void updatesValue() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Double temp = player.getCurrentTime().toMillis();
                currenttime = temp.intValue();
                //System.out.println(currenttime);
//                System.out.println("BINARY SEARCH " + Arrays.binarySearch(time, 0, count, currenttime));
                binary = Arrays.binarySearch(time, 0, count, currenttime);
                if (cue < lanternstates.length && lanternstates[cue][0] <= currenttime ) {

                    setLantern(lanternstates[cue][1], lanternstates[cue][2]);

                    //LOGIC TO ON LANTERNS ON THAT TIME
                    while(lanternstates[cue][0] == lanternstates[cue + 1][0]){
                        cue++;
                        setLantern(lanternstates[cue][1], lanternstates[cue][2]);
                    }
                    cue++;
                }
            }
        });
    }



}

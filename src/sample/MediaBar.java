package sample;

import javafx.application.Platform;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;

import java.io.*;
import java.nio.Buffer;
import java.util.*;

/**
 * Created by mocha on 22/4/18.
 */
public class MediaBar extends HBox {
    Slider time = new Slider();
    Button playbutton = new Button("||");
    Button flush = new Button("+");
    Button delete = new Button("-");
    Button nextseq = new Button(">>");
    Button prevseq = new Button("<<");
    MediaPlayer player;
    Text text = new Text();
    Main main = new Main();
    String write;
    CreateFile cf = new CreateFile();
    Integer nextclicked = 0;
    List<Integer> lint = new ArrayList<Integer>();
    Set<Integer> tempset = new HashSet<Integer>();
   // SpectrumView sv = new SpectrumView();

    public MediaBar(MediaPlayer play){
        Buttons but = new Buttons();
        player = play;
        setAlignment(Pos.CENTER);
        setPadding(new Insets(5,10,5,10));
        HBox.setHgrow(time, Priority.ALWAYS);
        playbutton.setPrefWidth(40);
        flush.setPrefWidth(40);
        text.setWrappingWidth(50);
        nextseq.setPrefWidth(40);
        prevseq.setPrefWidth(40);
        delete.setPrefWidth(40);
        time.setShowTickMarks(true);
        time.getStylesheets().add(getClass().getResource("slider.css").toExternalForm());
        File file = new File("out.png");
        //System.out.println(file.getAbsolutePath());
        //time.setStyle("-fx-background-image :url(" + file.getAbsolutePath()  +")");

        //SET HOVER TEXT
        flush.setTooltip(new Tooltip("Export to tempinstructions.tmp"));
        prevseq.setTooltip(new Tooltip("Seek previous sequence"));
        nextseq.setTooltip(new Tooltip("Find next sequence"));
        delete.setTooltip(new Tooltip("Delete sequences at this time"));
        playbutton.setTooltip(new Tooltip("Play/pause"));


        //ADD CHILDREN
        getChildren().add(playbutton);
        //TODO to go to next sequeunce, just slide more then click back
       // getChildren().add(nextseq);
        getChildren().add(prevseq);
        getChildren().add(flush);
        getChildren().add(delete);
        getChildren().add(time);
        getChildren().add(text);

        //TODO start paused
//        MediaPlayer.Status status = player.getStatus();
//        if(status == status.PLAYING) {
//            player.pause();
//            playbutton.setText(">");
//        }

        delete.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                boolean notfound = true;
                try{
                    Scanner scan = new Scanner(new File("tempinstructions.tmp"));
                    BufferedWriter br = new BufferedWriter(new FileWriter("delete.tmp"));
                    while(scan.hasNext()){
                        String line = scan.nextLine().toLowerCase();
                        Double dub = player.getCurrentTime().toMillis();
                        Double dubpos = player.getCurrentTime().toMillis() + 1;
                        Double dubneg = player.getCurrentTime().toMillis() - 1;
                        String temp = Integer.toString(dub.intValue());
                        String temppos = Integer.toString(dubpos.intValue());
                        String tempneg = Integer.toString(dubneg.intValue());
                        if(line.contains(temp) || line.contains(temppos) || line.contains(tempneg)){
                            System.out.println("Delete: " + temp);
                            notfound = false;
                        }else{
                            br.append(line);
                            br.append("\n");
                        }
                    }
                    br.close();
                    new File("delete.tmp").renameTo(new File("tempinstructions.tmp"));
                    PrintWriter pw = new PrintWriter("delete.tmp");
                    pw.close();
                    if(notfound){
                        System.out.println("Nothing found!");
                    }else{
                        //cf.sortAndPublish();
                    }
                    cf.sortAndPublish();
                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        });

        prevseq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    Scanner scan = new Scanner(new File("tempinstructions.tmp"));
                    Double dub = player.getCurrentTime().toMillis();
                    Map tempmap = new HashMap();
                    Integer time2 = 0;
                    if (nextclicked > 0) nextclicked--;

                    while(scan.hasNext()){
                        String line = scan.nextLine().toLowerCase(); //TIME VAR FROM FILE
                        //TIME VAR CURRENT is dub.intValue()
                        Integer time1 = new Integer(line.substring(0, line.indexOf(" ")));

                        //current is less than the set
                        if(time1 < dub.intValue()){
                            tempmap.put(0,time1);
                            time2 = time1;
                            continue;
                        } else if(dub.intValue() == time1){
                            tempmap.put(0,time1);
                            time2 = time1;
                            break;
                        } else{
                            break;
                        }
                    }
                    //WHILE LOOP COMPLETE
                   // System.out.println(tempmap.get(0) + " " + time2);
                    player.pause();
                    playbutton.setText(">");
                    time.setValue(time2 / player.getTotalDuration().toMillis()*100);
                    player.seek(player.getMedia().getDuration().multiply(time.getValue()/100));
                    text.setText(time2.toString());


                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        });

        nextseq.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    Scanner scan = new Scanner(new File("tempinstructions.tmp"));
                    Double dub = player.getCurrentTime().toMillis();
                    Map tempmap = new HashMap();
                    Integer time2 = 0;


                    while(scan.hasNext()){
                            String line = scan.nextLine().toLowerCase(); //TIME VAR FROM FILE
                            //TIME VAR CURRENT is dub.intValue()
                            Integer time1 = new Integer(line.substring(0, line.indexOf(" ")));
                            lint.add(time1);
                    }

                    tempset.addAll(lint);
                    lint.clear();
                    lint.addAll(tempset);
                    Collections.sort(lint);

                    time2 = lint.get(nextclicked);
                    if(nextclicked < lint.size() - 1){
                        nextclicked++;
                    }else{
                        System.out.println("NO MORE");
                    }

                    //WHILE LOOP COMPLETE
                    player.pause();
                    playbutton.setText(">");
                    time.setValue(time2 / player.getTotalDuration().toMillis()*100);
                    player.seek(player.getMedia().getDuration().multiply(time.getValue()/100));
                    text.setText(time2.toString());


                }catch(Exception e){
                    e.printStackTrace();
                }

            }
        });

        flush.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Double string = player.getCurrentTime().toMillis();
                MediaPlayer.Status status = player.getStatus();
                int temp = 0;
                if(status == status.PLAYING ) {
                    temp = string.intValue() - 225; //CORRECTION FACTOR BASED ON EXPERIMENT
                }
                else{
                    temp = string.intValue();
                }
                //TODO: give user response when data is written
                //TODO: Chase generator logic
                try{
                    but.writeStuff(Integer.toString(temp));
                    cf.sortAndPublish();
                }catch(IOException e){
                    e.printStackTrace();
                }
            }
        });

        playbutton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event){
                MediaPlayer.Status status = player.getStatus();
                if(status == status.PLAYING){
                    if(player.getCurrentTime().greaterThanOrEqualTo(player.getTotalDuration())){
                        player.seek(player.getStartTime());
                        player.play();
                    }
                    else{
                        player.pause();
                        playbutton.setText(">");
                    }
                }

                if(status == status.PAUSED || status == status.HALTED || status == status.STOPPED){
                    player.play();
                    playbutton.setText("||");
                }
            }
        });

        player.currentTimeProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                updatesValue();

            }
        });

        time.valueProperty().addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                if(time.isPressed()){
                    player.seek(player.getMedia().getDuration().multiply(time.getValue()/100));
                }
            }
        });
    }

    protected void updatesValue() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                //SLIDER BAR DIVIDE
                time.setValue(player.getCurrentTime().toMillis()/player.getTotalDuration().toMillis()*100);
                //Other processing
                Double string = player.getCurrentTime().toMillis();
                write = Integer.toString(string.intValue());
                text.setText(write);
            }
        });
    }


}

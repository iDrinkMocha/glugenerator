package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Formatter;

public class Main extends Application {

    Player player;
    FileChooser fileChooser;
    CreateFile cf = new CreateFile();

    @Override
    public void start(final Stage primaryStage){

        MenuItem open = new MenuItem("Load soundtrack");
        Menu file = new Menu("File");
        Menu export = new Menu("Export");
        MenuItem create = new MenuItem("Create instructions");
        MenuItem ex = new MenuItem("Export to instructions.txt");
       MenuBar menu = new MenuBar();

        file.getItems().add(open);
        file.getItems().add(create);
        export.getItems().add(ex);
        menu.getMenus().add(file);
        //menu.getMenus().add(export);
        fileChooser = new FileChooser();

        create.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cf.create();
            }
        });

        ex.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try{
                    cf.sortAndPublish();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });


        open.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                player.player.pause();
                File file = fileChooser.showOpenDialog(primaryStage);
                System.out.println(file);
                if(file != null){

                    try {
                        player = new Player(file.toURI().toURL().toExternalForm());
                        System.out.println();
                        player.setTop(menu);
                       // new Test(file,"out.png");
                        Scene scene = new Scene(player, 900,705, Color.BLACK);
                        primaryStage.setScene(scene);
                        primaryStage.show();

                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            }
        });
            File afile = fileChooser.showOpenDialog(primaryStage);
//            player = new Player("file:////Users/mocha/IdeaProjects/glugenerator/src/sample/wavfile.wav");
            //TODO Uncomment before export

            try{
                player = new Player(afile.toURI().toURL().toExternalForm());
            }catch (IOException e){
                e.printStackTrace();
            }
            player.setTop(menu);
            Scene scene = new Scene(player, 900, 705, Color.BLACK);
            primaryStage.setTitle("GLU Generator v1.1.18 - 44th HCSC");
            primaryStage.setScene(scene);
            primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }
}

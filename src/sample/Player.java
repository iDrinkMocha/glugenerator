package sample;

import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * Created by mocha on 22/4/18.
 */
public class Player extends BorderPane {
    Media media;
    MediaPlayer player;
    Pane mpane;
    MediaBar bar;
    Buttons bun;
    DebugView debug;
    ScrollPane sp;
    SpectrumView spec;

    public Player(String file){
        media = new Media(file);
        player = new MediaPlayer(media);
        bun = new Buttons();

        debug = new DebugView();
        sp = new ScrollPane();
        sp.setContent(debug);
        sp.setVbarPolicy(ScrollPane.ScrollBarPolicy.ALWAYS);
        sp.setHbarPolicy(ScrollPane.ScrollBarPolicy.NEVER);

        bar = new MediaBar(player);
        spec = new SpectrumView(player);

        setLeft(bun);
        setCenter(spec);
        setRight(sp);
        setBottom(bar);
        player.play();

    }
}

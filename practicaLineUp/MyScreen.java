import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;


public class MyScreen extends JFrame {
    MyScreen(){
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public double showVid(Song song) throws InterruptedException {
        Platform.setImplicitExit(false);
        File file = new File(song.getSongUrl());
        final JFXPanel jfxPanel = new JFXPanel();
        add(jfxPanel);
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        jfxPanel.setScene(new Scene(new Group(mediaView)));
        setSize(song.getWidth(),song.getHeight()+35);
        mediaView.setFitWidth(getWidth());
        Thread.sleep(500);
        mediaPlayer.play();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                mediaPlayer.setMute(false);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                mediaPlayer.setMute(true);
            }
        });
        return media.getDuration().toMillis();
    }
    public double showVid(Song song, String s) throws InterruptedException {
        Platform.setImplicitExit(false);
        File file = new File(song.getSongUrl());
        final JFXPanel jfxPanel = new JFXPanel();
        add(jfxPanel);
        Media media = new Media(file.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        jfxPanel.setScene(new Scene(new Group(mediaView)));
        setSize(song.getWidth(),song.getHeight()+35);
        mediaView.setFitWidth(getWidth());
        Thread.sleep(500);
        mediaPlayer.play();
        mediaPlayer.setMute(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowActivated(WindowEvent e) {
                mediaPlayer.setMute(false);
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                mediaPlayer.setMute(true);
            }
        });
        return media.getDuration().toMillis();
    }
}

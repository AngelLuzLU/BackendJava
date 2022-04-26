import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import java.io.File;

public class Song {
    private String name;
    private String songUrl;
    private int width;
    private int height;
    private double duration;

    Song(String name, String songUrl, int width, int height) {
        this.name = name;
        this.songUrl = songUrl;
        this.width = width;
        this.height = height;

    }

    public String getName(){  return name;  }
    public String getSongUrl(){  return songUrl;  }
    public int getWidth(){  return width;  }
    public int getHeight(){  return height;  }
    public double getDuration(){  return duration;  }

    public boolean setDuration(double duration){
        if(duration >= 1){
            this.duration = duration;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setSongUrl(String songUrl){
        if(!songUrl.isEmpty()){
            this.songUrl = songUrl;
            return true;
        }else
            return false;
    }

    public boolean setHeight(int height){
        if(height >= 1){
            this.height = height;
            return true;
        }else
            return false;
    }

    public boolean setWidth(int width){
        if(width >= 1){
            this.width = width;
            return true;
        }else
            return false;
    }
}

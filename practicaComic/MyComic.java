
import javax.sound.sampled.*;
import java.io.*;

public class MyComic extends Comic implements MyComicActionCallbacks{
    MyComic(String title, String autor, Vineta[] vinetas) {
        super(title, autor, vinetas);
    }

    @Override
    public void reproducir(Screen screen) {
        screen.setVisible(true);
        screen.setBounds(100,200,600,500);
        screen.out(showMessage(), "Times New Roman",22,Colors.PrestigeBlue);
        Vineta [] vinetas = getVinetas();
        Runnable run = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(200);
                    for(int i = 0;i < getNumVinetas(); i++){
                        screen.showImage(vinetas[i].getUrl());
                        Thread.sleep(vinetas[i].getDuracion());
                        screen.out("\n\n");
                    }
                }catch(InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };
        Thread reproduce = new Thread(run);
        reproduce.start();
    }

    public void reproducir(Screen screen, String audioUrl) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        reproducir(screen);
        Runnable runAudio = new Runnable() {
            @Override
            public void run() {
                try{
                    AudioInputStream ais = AudioSystem.getAudioInputStream(new File(audioUrl).getAbsoluteFile());
                    Clip clip = AudioSystem.getClip();
                    clip.open(ais);
                    clip.start();
                }catch(IOException | LineUnavailableException | UnsupportedAudioFileException io){
                    io.printStackTrace();
                }
            }
        };
        Thread repAudio = new Thread(runAudio);
        repAudio.start();
    }
}

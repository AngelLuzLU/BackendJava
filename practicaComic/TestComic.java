import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public class TestComic {
    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        Screen screen = new Screen();
        MyComic mycomic = new MyComic("Dissonance","Angel Luz Lopez Ureta",initVinetas());
        mycomic.reproducir(screen,"./src/assets/sound/Smp1.wav");
    }

    private static Vineta [] initVinetas(){
        Vineta [] vinetas = {
                new Vineta(1, 13000,"./src/assets/img/s1.png"),
                new Vineta(2,7000,"./src/assets/img/s2.png"),
                new Vineta(3,"./src/assets/img/s3.png"),
                new Vineta(4,"./src/assets/img/s4.png"),
                new Vineta(5,"./src/assets/img/s5.png"),
                new Vineta(6,"./src/assets/img/s6.png"),
                new Vineta(7,"./src/assets/img/s7.png"),
                new Vineta(8,"./src/assets/img/s8.png"),
                new Vineta(9,"./src/assets/img/s9.png"),
                new Vineta(10,"./src/assets/img/s10.png"),
                new Vineta(11, 9000,"./src/assets/img/s11.png"),
                new Vineta(12,"./src/assets/img/s12.png"),
                new Vineta(13,"./src/assets/img/s13.png"),
                new Vineta(14,"./src/assets/img/s14.png"),
                new Vineta(15, 9000,"./src/assets/img/s15.png"),
                new Vineta(16, 9000,"./src/assets/img/s16.png"),
                new Vineta(17,6000,"./src/assets/img/s17.png"),
                new Vineta(18, 12000,"./src/assets/img/s18.png")
        };
        return vinetas;
    }
}


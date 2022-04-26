import java.io.IOException;
import java.time.LocalDateTime;

public class MyFestTest {
    public static void main(String[] args) throws InterruptedException {
        Screen screen = new Screen("Presentation");
        MyFest myFest = createMyFest();

        myFest.showMessage(screen);
        myFest.preguntar(screen);
        myFest.iniciar();

    }

    private static Artist [] createArtists(){
        Artist [] artists = {
                new Artist("Kwoon","Post-Rock",new Song[]{
                        new Song("Bird","./src/assets/k1.mp4",1280,720),
                        new Song("I lived on the moon","./src/assets/k2.mp4",480,380),
                }),
                new Artist("Sigur Ros","Post-Rock",new Song[]{
                        new Song("Hoppipolla","./src/assets/s1.mp4",480,360),
                        new Song("Saeglopur","./src/assets/s2.mp4",480,360),
                }),
                new Artist("Explosions in the sky","Post-Rock",new Song[]{
                        new Song("Your Hand in mine","./src/assets/e2.mp4",720,720),
                        new Song("First Breath after coma","./src/assets/e1.mp4",480,360),
                }),
                new Artist("Ryuichi Sakamoto","Classic/Film",new Song[]{
                        new Song("Energy Flow","./src/assets/r2.mp4",426,320),
                        new Song("Bibo no Aozora","./src/assets/r1.mp4",426,320),
                }),
                new Artist("Triste Polizonte","Post-Rock",new Song[]{
                        new Song("El agujero en la cerca de tu jardin","./src/assets/t1.mp4",720,720),
                        new Song("Oyasumi","./src/assets/t2.mp4",720,720),
                }),
                new Artist("Chet Baker","Jazz",new Song[]{
                        new Song("Almost Blue","./src/assets/c1.mp4",720,720),
                        new Song("Alone Together","./src/assets/c2.mp4",720,720),
                }),
        };
        return artists;
    }

    private static MyFest createMyFest() {
        Artist[] artists = createArtists();
        MyFest myFest = new MyFest(
                artists,
                "My Fest",
                "./src/assets/poster.png",
                "Your PC",
                LocalDateTime.now(),
                new Stage[]{new Stage(artists, "Main")}
        );
        return myFest;
    }
}

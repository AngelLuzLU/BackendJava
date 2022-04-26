import java.awt.*;
import java.util.Objects;

public class MultiverseTest {
    public static void main(String[] args) {
        Screen screen = new Screen();
        testSpiderman(screen);
        testMiles(screen);
        testSpiderham(screen);
    }

    static void testSpiderham(Screen screen){
        Spiderham spiderham = new Spiderham(
                "Peter Porker",
                "Hombre",
                "Traje color rojo con detalles en negro y azul",
                6
        );
        screenInit(screen,spiderham, Colors.LighterPurple);
        spiderham.trepar(screen);
        spiderham.columpiarse(screen);
        spiderham.spiderSense(screen);
        spiderham.spiderFuerza(screen);
        spiderham.spiderVelocidad(screen);
        spiderham.sacarObjetos(screen);
        spiderham.flotar(screen);
    }

    static void testMiles(Screen screen){
        Miles miles = new Miles(
                "Miles Morales",
                "Hombre",
                "Traje negro con detalles en rojo",
                16
        );
        screenInit(screen,miles, Color.BLACK);
        miles.trepar(screen);
        miles.columpiarse(screen);
        miles.spiderSense(screen);
        miles.spiderFuerza(screen);
        miles.spiderVelocidad(screen);
        miles.desaparecer(screen);
        miles.electrocutar(screen);
    }

    static void testSpiderman(Screen screen){
        Spiderman spiderman = new Spiderman(
                "Peter Parker",
                "Hombre",
                "Traje color rojo con detalles en negro y azul",
                22
        );
        screenInit(screen,spiderman, Colors.BlueGrey);
        spiderman.trepar(screen);
        spiderman.columpiarse(screen);
        spiderman.spiderSense(screen);
        spiderman.spiderFuerza(screen);
        spiderman.spiderVelocidad(screen);
    }


    static void screenInit(Screen screen, Spiderguy spiderguy, Color color){
        if(!screen.isVisible()){  screen.setVisible(true);  }
        if(!Objects.equals(screen.getBounds(), new Rectangle(100, 200, 800, 600))){  screen.setBounds(100,200,800,600); }
        screen.out(spiderguy.showMessage(),"Monospace",20, color);
    }
}

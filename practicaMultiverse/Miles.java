public class Miles extends Spiderguy implements SpidermanActionCallbacks, MilesActionCallbacks {
    Miles(String name, String sex, String suitDesc, int age) {
        super(name, sex, suitDesc, age);
    }

    @Override
    public void desaparecer(Screen screen) {
        screen.repaint();
        screen.out("Miles camuflandose\n","Times",20, Colors.BalticSea);
        screen.showImage("./src/img/m1.jpg");
        screen.out("\n\n");
    }

    @Override
    public void electrocutar(Screen screen) {
        screen.repaint();
        screen.out("Miles electroctando a su enemigo\n","Times",20, Colors.BalticSea);
        screen.showImage("./src/img/m2.jpg");
        screen.out("\n\n");
    }

    @Override
    public void columpiarse(Screen screen) {
        screen.repaint();
        screen.out("Miles columpiandose\n","Times",20, Colors.BalticSea);
        screen.showImage("./src/img/m3.jpg");
        screen.out("\n\n");
    }

    @Override
    public void trepar(Screen screen) {
        screen.repaint();
        screen.out("Miles trepando edificios\n","Times",20, Colors.BalticSea);
        screen.showImage("./src/img/m4.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderFuerza(Screen screen) {
        screen.repaint();
        screen.out("Miles usando su super fuerza\n","Times",20, Colors.BalticSea);
        screen.showImage("./src/img/m5.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderVelocidad(Screen screen) {
        screen.repaint();
        screen.out("Miles demostrando su velocidad aumentada\n","Times",20, Colors.BalticSea);
        screen.showImage("./src/img/m6.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderSense(Screen screen) {
        screen.repaint();
        screen.out("Miles detectando a sus enemigos\n","Times",20, Colors.BalticSea);
        screen.showImage("./src/img/m7.jpg");
        screen.out("\n\n");
    }
}

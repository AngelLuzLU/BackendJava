public class Spiderman extends Spiderguy implements SpidermanActionCallbacks {
    Spiderman(String name, String sex, String suitDesc, int age) {
        super(name, sex, suitDesc, age);
    }

    @Override
    public void columpiarse(Screen screen) {
        screen.repaint();
        screen.out("Spiderman columpiandose\n","Times",20, Colors.HighBlue);
        screen.showImage("./src/img/sp1.jpg");
        screen.out("\n\n");
    }

    @Override
    public void trepar(Screen screen) {
        screen.repaint();
        screen.out("Spiderman trepando un edificio\n","Times",20, Colors.HighBlue);
        screen.showImage("./src/img/sp2.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderFuerza(Screen screen) {
        screen.repaint();
        screen.out("Spiderman usando su fuerza sobre humana\n","Times",20, Colors.HighBlue);
        screen.showImage("./src/img/sp3.jpeg");
        screen.out("\n\n");
    }

    @Override
    public void spiderVelocidad(Screen screen) {
        screen.repaint();
        screen.out("Spiderman demostrando su velocidad aumentada\n","Times",20, Colors.HighBlue);
        screen.showImage("./src/img/sp4.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderSense(Screen screen) {
        screen.repaint();
        screen.out("Spiderman detectando el peligro con su sentido aracnido\n","Times",20, Colors.HighBlue);
        screen.showImage("./src/img/sp5.png");
        screen.out("\n\n");
    }
}

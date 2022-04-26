public class Spiderham extends Spiderguy implements SpidermanActionCallbacks, SpiderhamActionCallbacks {
    Spiderham(String name, String sex, String suitDesc, int age) {
        super(name, sex, suitDesc, age);
    }

    @Override
    public void flotar(Screen screen) {
        screen.repaint();
        screen.out("Spiderham puede flotar en la dirección de cualquier pay recien horneado\n","Times",20, Colors.GloomyPurple);
        screen.showImage("./src/img/h1.jpg");
        screen.out("\n\n");
    }

    @Override
    public void sacarObjetos(Screen screen) {
        screen.repaint();
        screen.out("Spiderham puede sacar 'magicamente' objetos\n","Times",20, Colors.GloomyPurple);
        screen.showImage("./src/img/h2.jpg");
        screen.out("\n\n");
    }

    @Override
    public void columpiarse(Screen screen) {
        screen.repaint();
        screen.out("Spiderham columpiandose\n","Times",20, Colors.GloomyPurple);
        screen.showImage("./src/img/h3.jpg");
        screen.out("\n\n");
    }

    @Override
    public void trepar(Screen screen) {
        screen.repaint();
        screen.out("Spiderham trepando\n","Times",20, Colors.GloomyPurple);
        screen.showImage("./src/img/h4.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderFuerza(Screen screen) {
        screen.repaint();
        screen.out("Spiderham posee una fuerza superior a la del cerdito promedio\n","Times",20, Colors.GloomyPurple);
        screen.showImage("./src/img/h5.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderVelocidad(Screen screen) {
        screen.repaint();
        screen.out("Spiderham posee una velocidad superior a la del cerdito promedio\n","Times",20, Colors.GloomyPurple);
        screen.showImage("./src/img/h6.jpg");
        screen.out("\n\n");
    }

    @Override
    public void spiderSense(Screen screen) {
        screen.repaint();
        screen.out("Spiderham usa su sentido aracnido para detectar el peligro\n","Times",20, Colors.GloomyPurple);
        screen.showImage("./src/img/h7.jpg");
        screen.out("\n\n");
    }

}

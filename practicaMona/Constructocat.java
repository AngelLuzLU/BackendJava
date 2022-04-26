package practicaMona;

public class Constructocat extends Octocat{
    Constructocat(){
        setOutfit("a yellow construction helmet, with ear-holes, of course");
    }

    @Override
    public void eat() {
        System.out.println("Mona the Constructocat is eating a very nice meal consting on a gansito and a coca");
    }

    public void construct(){
        System.out.println("Mona the Constructocat is constructing a new piece of infrastructure crucial for the future of the world");
    }

    public void blameTheChalan(){
        System.out.println("Mona the Constructocat would never commit an error, it's the Chalan's fault");
    }

    public String toString(){
        return super.toString() + String.format(", construct and blameTheChalan.\nHer current outfit consist on\n%s.",getOutfit());
    }
}

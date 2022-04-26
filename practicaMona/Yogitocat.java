package practicaMona;

public class Yogitocat extends  Octocat{
    Yogitocat(){
        setOutfit("nothing");
    }

    public void eat(){
        System.out.println("Mona the yogicat doesn't need to eat, meditation feeds her soul");
        meditate();
    }

    public void meditate(){
        System.out.println("Please be silent, Mona the yogicat is meditating");
    }

    public String toString(){
        return super.toString() + String.format(", meditate.\nHer current outfit consist on\n%s. ",getOutfit());
    }

}

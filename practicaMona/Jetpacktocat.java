package practicaMona;

public class Jetpacktocat extends Octocat{
    Jetpacktocat(){
        setOutfit("a jetpack, nothing else");
    }

    public void fly(){
        System.out.println("Mona the Jetpacktocat is flying across the sky with her jetpack");
    }

    public String toString(){
        return super.toString() + String.format(", fly.\nHer current outfit consist on\n%s.",getOutfit());
    }
}

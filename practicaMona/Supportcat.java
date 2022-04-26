package practicaMona;

public class Supportcat extends Octocat{
    Supportcat(){
        setOutfit("microphone headset");
    }
    public void attendCall(){
        System.out.println("Mona the Supportcat is attending a costumer's call, shhh,\nshe is about to tell the client to restart the system, never fails");
    }

    public String toString(){
        return super.toString() + String.format(", attendCall.\nHer current outfit consist on\n%s.",getOutfit());
    }
}

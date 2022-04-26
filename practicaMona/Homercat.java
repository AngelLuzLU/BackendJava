package practicaMona;

public class Homercat extends Octocat{
    private String skinColor = "yellow";

    Homercat(){
        setOutfit("a white collared shirt, blue jeans and black shoes");
    }

    public String getSkinColor(){  return skinColor;  }
    @Override
    public void eat() {
        System.out.println("Mona the homercat is eating donuts");
    }

    public void drinkBeer(){
        System.out.println("Mona the homercat is drinking a duff beer");
    }

    public void chokeBart(){
        System.out.println("Mona the homercat is aggressively choking her son bartocat");
    }

    public String toString(){
        return super.toString() + String.format(", drinkBeer and chokeBart.\nHer current outfit consist on\n%s.\nbut her skin is now %s ",getOutfit() ,getSkinColor());
    }
}

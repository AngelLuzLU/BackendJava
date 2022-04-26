package practicaMona;

public class Fintechtocat extends Octocat{
    Fintechtocat(){
        setOutfit("an elegant grey suit, blue tie and white shirt");
    }

    public void eat(){
        System.out.println("Mona is eating at a fancy restaurant that she loves");
    }

    public void readTechNews(){
        System.out.println("Mona the fintechtocat is reading the daily tech news from her favourite site");
    }

    public void code(){
        System.out.println("Mona the fintechtocat is programming a new software that will facilitate our everyday lives");
    }

    public void checkCriptoMarkets(){
        System.out.println("Mona the fintechtocat is closely monitoring her criptocurrency investments");
    }

    public void socialNetworking(){
        System.out.println("Mona the fintechtocat is checking and posting on her social medias to stay up to date with her octofriends and colleagues");
    }

    public String toString(){
        return super.toString() + String.format(", readTechNews, code,\ncheckCriptoMarkets, socialNetworking.\nHer current outfit consist on\n%s. ",getOutfit());
    }
}

package practicaMona;
public class Octocat {
    private int numberOfWhiskers = 4;
    private int numberOfEars = 2;
    private int numberOfLegs = 5;
    private String face = "kawaii cat face";
    private String form = "Cat head and 'octopus' body";
    private String name = "Mona";
    private String outfit;

    public int getNumberOfWhiskers(){ return numberOfWhiskers;  }
    public int getNumberOfEars(){  return numberOfEars;  }
    public int getNumberOfLegs(){  return numberOfLegs;  }
    public String getFace(){  return face;  }
    public String getForm(){  return form;  }
    public String getName(){  return name;  }
    public String getOutfit(){  return outfit;  }

    public boolean setOutfit(String outfit){
        if(!outfit.isEmpty()){
            this.outfit = outfit;
            return true;
        }else
            return false;
    }

    public void eat(){
        System.out.println("Mona is eating cat food and tuna, her favourite");
    }

    public void sleep(){
        System.out.println("Mona went to sleep on her favourite couch");
    }

    public String toString(){
        return String.format("""
                
                %s the %s
                -----------------------
                Mona has %d whiskers,
                %d ears and %d octopus-like legs.
                Mona's face is a %s,
                but her body is composed of a
                %s.
                Some of the activities she does are
                eat, sleep""",getName(), this.getClass().getSimpleName(), getNumberOfWhiskers(), getNumberOfEars(), getNumberOfLegs(), getFace(), getForm());
    }
}

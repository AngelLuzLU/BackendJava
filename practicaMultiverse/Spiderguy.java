public class Spiderguy {
    private String name;
    private String sex;
    private String suitDesc;
    private int age;

    Spiderguy(String name, String sex, String suitDesc, int age){
        this.name = name;
        this.sex = sex;
        this.suitDesc = suitDesc;
        this.age = age;
    }

    public String getName(){  return name;  }
    public String getSex(){  return sex;  }
    public String getSuitDesc(){  return suitDesc;  }
    public int getAge(){  return age;  }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setSex(String sex){
        if(!sex.isEmpty()){
            this.sex = sex;
            return true;
        }else
            return false;
    }

    public boolean setSuitDesc(String suitDesc){
        if(!suitDesc.isEmpty()){
            this.suitDesc = suitDesc;
            return true;
        }else
            return false;
    }

    public boolean setAge(int age){
        if(age >= 1){
            this.age = age;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return String.format("""
                %s
                --------------------------
                Nombre: %s
                Sexo: %s
                Edad: %d anos
                Descripcion del traje: %s 
                
                """,this.getClass().getSimpleName(), getName(),getSex(),getAge(),getSuitDesc());
    }
}

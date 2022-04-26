package practicaHarry;

public class PersonajeHP {
    private String nombre;
    private String casa;
    private String sexo;
    private String boggart;
    private String patronus;
    private String nacionalidad;
    private String purezaDeSangre;
    private String estadoCivil;
    private int edad;

    PersonajeHP(String nombre, String casa, String sexo, String boggart, String patronus, String nacionalidad, String purezaDeSangre, String estadoCivil, int edad) {
        this.nombre = nombre;
        this.casa = casa;
        this.sexo = sexo;
        this.boggart = boggart;
        this.patronus = patronus;
        this.nacionalidad = nacionalidad;
        this.purezaDeSangre = purezaDeSangre;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }

    public String getNombre(){  return nombre;  }
    public String getCasa(){  return casa;  }
    public String getSexo(){ return sexo;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }
    public String getNacionalidad(){  return nacionalidad;  }
    public String getPurezaDeSangre(){  return purezaDeSangre;  }
    public String getEstadoCivil(){  return estadoCivil;  }
    public int getEdad(){  return edad;  }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;
    }

    public boolean setSexo(String sexo){
        if(!sexo.isEmpty()){
            this.sexo = sexo;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public boolean setNacionalidad(String nacionalidad){
        if(!nacionalidad.isEmpty()){
            this.nacionalidad = nacionalidad;
            return true;
        }else
            return false;
    }

    public boolean setPurezaDeSangre(String purezaDeSangre){
        if(!purezaDeSangre.isEmpty()){
            this.purezaDeSangre = purezaDeSangre;
            return true;
        }else
            return false;
    }

    public boolean setEstadoCivil(String estadoCivil){
        if(!estadoCivil.isEmpty()){
            this.estadoCivil = estadoCivil;
            return true;
        }else
            return false;
    }

    public boolean setEdad(int edad){
        if(edad >= 0){
            this.edad = edad;
            return true;
        }else
            return false;
    }

    public String toString(){
        return String.format("""
                %s
                ----------------------------------
                Edad: %d anos
                Sexo: %s
                Nacionalidad: %s
                Casa de Hogwarts: %s
                Pureza de sangre: %s
                Boggart: %s
                Patronus: %s
                Estado civil: %s
                \n""", getNombre(), getEdad(), getSexo(), getNacionalidad(), getCasa(), getPurezaDeSangre(), getBoggart(), getPatronus(), getEstadoCivil());
    }
}

public class Comic {
    private String title;
    private String autor;
    private Vineta [] vinetas;
    private int numVinetas;

    Comic(String title, String autor, Vineta [] vinetas){
        this.title = title;
        this.autor = autor;
        this.vinetas = vinetas;
        this.numVinetas = vinetas.length;
    }

    public String getTitle(){  return title;  }
    public String getAutor(){  return autor;  }
    public Vineta [] getVinetas(){  return vinetas;  }
    public int getNumVinetas(){  return  numVinetas;  }

    public boolean setTitle(String title){
        if(!title.isEmpty()){
            this.title = title;
            return true;
        }else
            return false;
    }

    public boolean setAutor(String autor){
        if(!autor.isEmpty()){
            this.autor = autor;
            return true;
        }else
            return false;
    }

    public boolean setVinetas(Vineta [] vinetas){
        if(vinetas.length >= 1){
            this.vinetas = vinetas;
            setNumVinetas(vinetas);
            return true;
        }else
            return false;
    }

    private void setNumVinetas(Vineta [] vinetas){
        this.numVinetas = vinetas.length;
    }

    public String showMessage(){
        return String.format("""
                Comic: '%s'
                --------------------------
                Autor: %s
                Numero de vinetas: %d
                """,getTitle(),getAutor(), getNumVinetas());
    }
}

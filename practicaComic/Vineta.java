public class Vineta {
    private int id;
    private int duracion;
    private String url;

    Vineta(int id, String url){
        this.id = id;
        this.url = url;
        this.duracion = 5000;
    }

    Vineta(int id, int duracion, String url){
        this.id = id;
        this.duracion = duracion;
        this.url = url;
    }

    public int getId(){  return id;  }
    public int getDuracion(){  return duracion;  }
    public String getUrl(){  return url;  }

    public boolean setId(int id){
        if(id >= 1){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setDuracion(int duracion){
        if(duracion >= 1){
            this.duracion = duracion;
            return true;
        }else
            return false;
    }

    public boolean setUrl(String url){
        if(!url.isEmpty()){
            this.url = url;
            return true;
        }else
            return false;
    }
}

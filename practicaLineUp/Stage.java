public class Stage {
    private Artist [] artists;
    private String name;

    Stage(Artist [] artists, String name){
        this.name = name;
        this.artists = artists;
    }

    public Artist [] getArtists(){  return artists;  }
    public String getName(){  return name;  }

    public boolean setArtists(Artist [] artists){
        if(artists.length >= 1){
            this.artists = artists;
            return true;
        }else
            return false;
    }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }
}

public class Artista {
    private String name;
    private String genre;
    private Song [] songs;

    Artista(String name, String genre, Song [] songs){
        this.name = name;
        this.genre = genre;
        this.songs = songs;
    }

    public String getName(){  return name;  }
    public String getGenre(){  return genre;  }
    public Song [] getSongs(){  return songs;  }

    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setGenre(String genre){
        if(!genre.isEmpty()){
            this.genre = genre;
            return true;
        }else
            return false;
    }

    public boolean setSongs(Song [] songs){
        if(songs.length >= 1){
            this.songs = songs;
            return true;
        }else
            return false;
    }
}

import java.time.LocalDateTime;

public class Festival {
    private Artist [] artists;
    private String name;
    private String cartel;
    private String location;
    private LocalDateTime dateTime;
    private Stage [] stages;

    Festival(Artist [] artists, String name, String cartel, String location, LocalDateTime dateTime, Stage [] stages){
        this.artists = artists;
        this.name = name;
        this.cartel = cartel;
        this.location = location;
        this.dateTime = dateTime;
        this.stages = stages;
    }

    public Artist [] getArtists(){  return artists;  }
    public String getName(){  return name;  }
    public String getCartel(){  return cartel;  }
    public String getLocation(){  return location;  }
    public LocalDateTime getDateTime(){  return dateTime;  }
    public Stage [] getStages(){  return stages;  }

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

    public boolean setCartel(String cartel){
        if(!cartel.isEmpty()){
            this.cartel = cartel;
            return true;
        }else
            return false;
    }

    public boolean setLocation(String location){
        if(!location.isEmpty()){
            this.location = location;
            return true;
        }else
            return false;
    }

    public boolean setDateTime(LocalDateTime dateTime){
        if(!dateTime.isBefore(LocalDateTime.now())){
            this.dateTime = dateTime;
            return true;
        }else
            return false;
    }

    public boolean setStages(Stage [] stages){
        if(stages.length >= 1){
            this.stages = stages;
            return true;
        }else
            return false;
    }
}

package models;

import play.db.jpa.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Station extends Model {
    public String name;
    public double lat;
    public double lng;
    public Stat stat;


    @OneToMany(cascade = CascadeType.ALL)
    public List<Reading> readings = new ArrayList<>();

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getLat() {

        return lat;
    }

    public void setLat(double lat) {

        this.lat = lat;
    }

    public double getLng() {

        return lng;
    }

    public void setLng(double lng) {

        this.lng = lng;
    }

    public Stat getStat() {

        return stat;
    }

    public void setStat(Stat stat) {

        this.stat = stat;
    }

    public List<Reading> getReadings() {

        return readings;
    }

    public void setReadings(List<Reading> readings) {

        this.readings = readings;
    }

    public Station() {

    }
}

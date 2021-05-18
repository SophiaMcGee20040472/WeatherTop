package models;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Reading extends Model {
    public String name;
    public int code;
    public double temperature;
    public float windSpeed;
    public int pressure;


    public Reading(String name, int code, double temperature, float windSpeed, int pressure) {
        this.name = name;
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCode() {

        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getTemperature() {

        return temperature;
    }

    public void setTemperature(double temperature) {

        this.temperature = temperature;
    }

    public float getWindSpeed() {

        return windSpeed;
    }

    public void setWindSpeed(float windSpeed) {

        this.windSpeed = windSpeed;
    }

    public int getPressure() {

        return pressure;
    }

    public void setPressure(int pressure) {

        this.pressure = pressure;
    }
}

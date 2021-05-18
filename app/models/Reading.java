package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Reading extends Model {
    public String name;
    public int code;
    public double temperature;
    public float windSpeed;
    public int pressure;
    public int windDirection;
    public float windChill;

    public Reading(String name, int code, double temperature, float windSpeed, int pressure,int windDirection,float windChill) {
        this.name = name;
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.windDirection=windDirection;
        this.windChill=windChill;

    }

    public Reading( int code, double temp, float windSpeed, int windDirection, int pressure) {
        this.code = code;
        this.temperature = temp;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.pressure = pressure;
    }

    public float getWindChill() {
        return windChill;
    }
    public void setWindChill(float windChill){}

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

    public int getWindDirection() {
        return windDirection;
    }
    public void setWindDirection(int windDirection){
        this.windDirection=windDirection;
    }
}

package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Reading extends Model {
    public String name;
    public int code;
    public double temperature;
    public float windSpeed;
    public int pressure;
    public int windDirection;
    public float windChill;
    public Date date;

    public Reading(String name, int code, double temperature, float windSpeed, int pressure, int windDirection, float windChill, Date date) {
        this.name = name;
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.pressure = pressure;
        this.windDirection = windDirection;
        this.windChill = windChill;
        this.date = date;

    }

    public Reading(int code, double temp, float windSpeed, int windDirection, int pressure, Date date) {
        this.code = code;
        this.temperature = temp;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.pressure = pressure;
        this.date = date;
    }

    public Reading(Date date, int code, double temperature, float windSpeed, int windDirection, int pressure) {
        this.code = code;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.windDirection = windDirection;
        this.pressure = pressure;
        this.date = date;
    }

    public float getWindChill() {

        return windChill;
    }

    public void setWindChill(float windChill) {

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

    public int getWindDirection() {

        return windDirection;
    }

    public void setWindDirection(int windDirection) {

        this.windDirection = windDirection;
    }

    public Date getDate() {

        return date;
    }

    public void setDate(Date date) {

        this.date = date;
    }

}

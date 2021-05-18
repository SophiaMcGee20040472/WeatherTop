package models;

import play.db.jpa.Model;


public class Stat extends Model {

    public String weatherType;
    public int pressureType;
    public double temperatureType;
    public double fahrenheitType;
    public int windSpeedType;
    public String windDirectionType;
    public float windChillType;

    public Stat() {

    }

    public Stat(String weatherType, int pressureType, double temperatureType, double fahrenheitType, int windSpeedType, String windDirectionType, float windChillType) {
        this.weatherType = weatherType;
        this.pressureType = pressureType;
        this.temperatureType = temperatureType;
        this.fahrenheitType = fahrenheitType;
        this.windSpeedType = windSpeedType;
        this.windDirectionType = windDirectionType;
        this.windChillType = windChillType;

    }

    public float getWindChillType() {

        return windChillType;
    }

    public void setWindChillType(float windChillType) {

        this.windChillType = windChillType;
    }

    public String getWindDirectionType() {

        return windDirectionType;
    }

    public void setWindDirectionType(String windDirectionType) {

        this.windDirectionType = windDirectionType;
    }


    public String getWeatherType() {

        return weatherType;
    }

    public int getPressureType() {

        return pressureType;
    }

    public double getTemperatureType() {

        return temperatureType;
    }

    public double getFahrenheitType() {

        return fahrenheitType;
    }

    public int getWindSpeedType() {

        return windSpeedType;
    }

    public void setWeatherType(String weatherType) {

        this.weatherType = weatherType;
    }

    public void setPressureType(int pressureType) {

        this.pressureType = pressureType;
    }

    public void setTemperatureType(double temperatureType) {

        this.temperatureType = temperatureType;
    }

    public void setFahrenheitType(double fahrenheitType) {

        this.fahrenheitType = fahrenheitType;
    }

    public void setWindSpeedType(int windSpeedType) {

        this.windSpeedType = windSpeedType;
    }


}

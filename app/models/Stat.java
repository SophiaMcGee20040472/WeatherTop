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
    public float minWindSpeed;
    public float maxWindSpeed;
    public double minTemperature;
    public double maxTemperature;
    public int minPressure;
    public int maxPressure;
    public String windTrend;
    public String pressureTrend;
    public String tempTrend;


    public Stat() {


    }

    public float getMinWindSpeed() {

        return minWindSpeed;
    }

    public void setMinWindSpeed(float minWindSpeed) {

        this.minWindSpeed = minWindSpeed;
    }

    public float getMaxWindSpeed() {

        return maxWindSpeed;
    }

    public void setMaxWindSpeed(float maxWindSpeed) {

        this.maxWindSpeed = maxWindSpeed;
    }

    public double getMinTemperature() {

        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {

        this.minTemperature = minTemperature;
    }

    public double getMaxTemperature() {

        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {

        this.maxTemperature = maxTemperature;
    }

    public int getMinPressure() {

        return minPressure;
    }

    public void setMinPressure(int minPressure) {

        this.minPressure = minPressure;
    }

    public int getMaxPressure() {

        return maxPressure;
    }

    public void setMaxPressure(int maxPressure) {

        this.maxPressure = maxPressure;
    }

    public Stat(String weatherType, int pressureType, double temperatureType, double fahrenheitType, int windSpeedType, String windDirectionType, float windChillType, Reading minPressure) {
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

    public String getWindTrend() {

        return windTrend;
    }

    public void setWindTrend(String windTrend) {

        this.windTrend = windTrend;
    }

    public String getPressureTrend() {

        return pressureTrend;
    }

    public void setPressureTrend(String pressureTrend) {

        this.pressureTrend = pressureTrend;
    }

    public String getTempTrend() {

        return tempTrend;
    }

    public void setTempTrend(String tempTrend) {

        this.tempTrend = tempTrend;
    }
}

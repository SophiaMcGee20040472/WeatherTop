package controllers;

import models.Reading;
import models.Stat;
import models.Station;
import play.Logger;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.Collections;

public abstract class StationCtrl extends Controller {


    public static void index(Long id) {
        Station station = Station.findById(id);
        Logger.info("Station id = " + id);

        Stat stat = new Stat();

        int readingSize = station.readings.size();

        try {
            int code = station.readings.get(readingSize - 1).getCode();
            stat.setWeatherType(weatherCode(code));

            int pressure = station.readings.get(readingSize - 1).getPressure();
            stat.setPressureType(pressure);

            double temperature = station.readings.get(readingSize - 1).getTemperature();
            stat.setTemperatureType(temperature);
            stat.setFahrenheitType(fahrenheit(temperature));

            float windChill = station.readings.get(readingSize - 1).getWindSpeed();
            stat.setWindChillType(windChill(temperature, windChill));

            float windSpeed = station.readings.get(readingSize - 1).getWindSpeed();
            stat.setWindSpeedType(Beaufort(windSpeed));

            int windDirection = station.readings.get(readingSize - 1).getWindDirection();
            stat.setWindDirectionType(weatherDirection(windDirection));

            stat.setMinWindSpeed(minWindSpeed(station));

            stat.setMaxWindSpeed(maxWindSpeed(station));

            stat.setMinTemperature(minTemperature(station));

            stat.setMaxTemperature(maxTemperature(station));

            stat.setMinPressure(minPressure(station));

            stat.setMaxPressure(maxPressure(station));
            station.setStat(stat);


        } catch (Exception e) {
            //  Block of code to handle errors
        }

        Float minSpeed = minWindSpeed(station);
        Float maxSpeed = maxWindSpeed(station);
        Double maxTemp = maxTemperature(station);
        Double minTemp = minTemperature(station);
        Integer minPress = minPressure(station);
        Integer maxPress = maxPressure(station);

        render("station.html", station, minSpeed,maxSpeed,maxTemp,minTemp,minPress,maxPress);

    }

    private static Float minWindSpeed(Station station) {
        Float windSpeed = 0.0f;
        ArrayList<Float> minimum = new ArrayList<>();
        for (int i = 0; i < station.readings.size(); i++) {
            minimum.add(station.getReadings().get(i).getWindSpeed());
        }
        if(minimum.size()>0){
            windSpeed = Collections.min(minimum);
        }

        return windSpeed;
    }

    private static Float maxWindSpeed(Station station) {
        Float wind = 0.0f;
        ArrayList<Float> maximum = new ArrayList<>();
        for (int i = 0; i < station.readings.size(); i++) {
            maximum.add(station.getReadings().get(i).getWindSpeed());
        }
        if(maximum.size()>0){
            wind = Collections.max(maximum);}
        return wind;
    }
    private static Double minTemperature(Station station) {
        Double minitemp = 0.0;
        ArrayList<Double> minimum = new ArrayList<>();
        for (int i = 0; i < station.readings.size(); i++) {
            minimum.add(station.getReadings().get(i).getTemperature());
        }
        if(minimum.size()>0){
            minitemp = Collections.min(minimum);}
        return minitemp;
    }

    private static Double maxTemperature(Station station) {
        Double temp = 0.0;
        ArrayList<Double> maximum = new ArrayList<>();
        for (int i = 0; i < station.readings.size(); i++) {
            maximum.add(station.getReadings().get(i).getTemperature());
        }
        if(maximum.size()>0){
            temp = Collections.max(maximum);}
        return temp;
    }
    private static Integer minPressure(Station station) {
        int minPress =0;
        ArrayList<Integer> minimum = new ArrayList<>();
        for (int i = 0; i < station.readings.size(); i++) {
            minimum.add(station.getReadings().get(i).getPressure());
        }
        if(minimum.size()>0){
            minPress = Collections.min(minimum);}
        return minPress;
    }
    private static Integer maxPressure(Station station) {
        int maxPress =0;
        ArrayList<Integer> maximum = new ArrayList<>();
        for (int i = 0; i < station.readings.size(); i++) {
            maximum.add(station.getReadings().get(i).getPressure());
        }
        if(maximum.size()>0){
            maxPress = Collections.max(maximum);}
        return maxPress;
    }



    private static float windChill(double temperature, float windSpeed) {

        double windChill = (13.12 + 0.6215 * temperature - 11.37 * Math.pow(windSpeed, 0.16) + 0.3965 * temperature * Math.pow(windSpeed, 0.16));
        return (float) (Math.ceil(windChill * 100) / 100);
    }

    private static double fahrenheit(Double temperature) {

        return temperature * 9 / 5 + 32;
    }

    private static String weatherCode(int code) {
        String result;
        switch (code) {
            case 100:
                result = "Clear";
                break;
            case 200:
                result = "Partial Cloudy";
                break;
            case 300:
                result = "Cloudy";
                break;
            case 400:
                result = "light Showers";
                break;
            case 500:
                result = "Heavy Showers";
                break;
            case 600:
                result = "Rain";
                break;
            case 700:
                result = "Snow";
                break;
            case 800:
                result = "Thunder";
                break;
            default:
            case 900:
                result = "Not a Weather Code";
                break;
        }
        return result;
    }

    private static int Beaufort(float windSpeed) {

        if (windSpeed <= 1) {
            return 0;
        } else if (windSpeed <= 5) {
            return 1;
        } else if (windSpeed <= 11) {
            return 2;
        } else if (windSpeed <= 19) {
            return 3;
        } else if (windSpeed <= 28) {
            return 4;
        } else if (windSpeed <= 38) {
            return 5;
        } else if (windSpeed <= 49) {
            return 6;
        } else if (windSpeed <= 61) {
            return 7;
        } else if (windSpeed <= 74) {
            return 8;
        } else if (windSpeed <= 88) {
            return 9;
        } else if (windSpeed <= 102) {
            return 10;
        } else if (windSpeed <= 117) {
            return 11;
        } else {
            return 12;
        }
    }

    private static String weatherDirection(int windDirection) {
        String direction;

        if ((windDirection >= 348.75) && (windDirection <= 360) || (windDirection >= 0) && (windDirection <= 11.25)) {
            direction = "North";
        } else if ((windDirection >= 11.25) && (windDirection <= 33.75)) {
            direction = "North North E";
        } else if ((windDirection >= 33.75) && (windDirection <= 56.25)) {
            direction = "North East";
        } else if ((windDirection >= 56.25) && (windDirection <= 78.75)) {
            direction = "East North East";
        } else if ((windDirection >= 78.75) && (windDirection <= 101.25)) {
            direction = "East";
        } else if ((windDirection >= 101.25) && (windDirection <= 123.75)) {
            direction = "East South East";
        } else if ((windDirection >= 123.75) && (windDirection <= 146.25)) {
            direction = "South East";
        } else if ((windDirection >= 146.25) && (windDirection <= 168.75)) {
            direction = "South South East";
        } else if ((windDirection >= 168.75) && (windDirection <= 191.25)) {
            direction = "South";
        } else if ((windDirection >= 191.25) && (windDirection <= 213.75)) {
            direction = "South South West";
        } else if ((windDirection >= 213.75) && (windDirection <= 236.25)) {
            direction = "South West";
        } else if ((windDirection >= 236.25) && (windDirection <= 258.75)) {
            direction = "West South West ";
        } else if ((windDirection >= 258.75) && (windDirection <= 281.25)) {
            direction = "West";
        } else if ((windDirection >= 281.25) && (windDirection <= 303.75)) {
            direction = "West North West";
        } else if ((windDirection >= 303.75) && (windDirection <= 326.25)) {
            direction = "North West";
        } else if ((windDirection >= 326.25) && (windDirection <= 348.75)) {
            direction = "North North West";
        } else {
            direction = "True north";
        }
        return direction;
    }

    public static void deleteReading(Long id, Long readingid) {
        Station station = Station.findById(id);
        Reading reading = Reading.findById(readingid);
        Logger.info("Removing" + reading);
        station.readings.remove(reading);
        station.save();
        reading.delete();
        redirect("/station/" + id);
    }

    public static void addReading(Long id, int code, double temperature, float windSpeed, int windDirection, int pressure) {
        Station station = Station.findById(id);
        Reading reading = new Reading(code, temperature, windSpeed, windDirection, pressure);
        station.getReadings().add(reading);
        station.save();
        //redirect("/station/" + id);
        redirect("/station/" + id);

    }

}




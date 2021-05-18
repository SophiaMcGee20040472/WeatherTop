package controllers;

import models.Stat;
import models.Station;
import play.mvc.*;
import play.Logger;


import java.util.List;

public class Dashboard extends Controller {


    public static void index() {
        Logger.info("Rendering Dashboard");

        List<Station> station = Station.findAll();
        //System.out.println(station.size());

        for (int i = 0; i < station.size(); i++) {
            Stat stat = new Stat();

            //System.out.println(station.get(i).getName());
            Integer code = station.get(i).getReadings().get(1).getCode();
            stat.setWeatherType(weatherCode(code));

            Integer pressure = station.get(i).getReadings().get(1).getPressure();
            stat.setPressureType(pressure);

            Double temperature = station.get(i).getReadings().get(1).getTemperature();
            stat.setTemperatureType(temperature);
            stat.setFahrenheitType(fahrenheit(temperature));

            float windSpeed = station.get(i).getReadings().get(1).getWindSpeed();
            stat.setWindSpeedType(Beaufort(windSpeed));
            station.get(i).setStat(stat);

            //System.out.println(station.get(i).getStat().getWeatherType());
            //System.out.println(station.get(i).readings.get(1).getPressure());

        }

        render("dashboard.html", station);
    }

    private static double fahrenheit(Double temperature) {
        return temperature * 9 / 5 + 32;
    }


    private static String weatherCode(int code) {
        String result = "";
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
            default:
            case 800:
                result = "Thunder";
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
}

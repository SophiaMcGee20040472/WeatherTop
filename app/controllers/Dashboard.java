package controllers;

import models.Reading;
import models.Station;
import play.Logger;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends Controller {

    public static void index() {
        Logger.info("Rendering Dashboard");
        List<Station> station = Station.findAll();
        render("dashboard.html", station);

    }

    public static void addStation(String name) {
        Station station = new Station();
        List<Reading> readings = new ArrayList<>();
        station.setName(name);
        station.setReadings(readings);
        Logger.info("Adding a new Station called " + name);
        station.save();
        redirect("/dashboard");
    }

    public static void deleteStation(Long id) {
        Station station = Station.findById(id);
        Logger.info("Removing" + station.name);
        station.delete();
        redirect("/dashboard");
    }

}


package controllers;

import models.Member;
import models.Reading;
import models.Station;
import play.Logger;
import play.mvc.Controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dashboard extends Controller {

    public static void index() {
        Logger.info("Rendering Dashboard");
        Member member = Accounts.getLoggedInMember();
        List<Station> station = member.stations;
        station.sort(Comparator.comparing(Station::getName, String.CASE_INSENSITIVE_ORDER));
        render("dashboard.html", member, station);
    }

    public static void addStation(String name, double lat, double lng) {
        Logger.info("Adding a Station");
        Member member = Accounts.getLoggedInMember();
        Station station = new Station();
        List<Reading> readings = new ArrayList<>();
        station.setName(name);
        station.setLat(lat);
        station.setLng(lng);
        station.setReadings(readings);
        Logger.info("Adding a new Station called " + name);
        member.stations.add(station);
        member.save();
        /*   station.save();*/
        redirect("/dashboard");
    }

    public static void deleteStation(Long id) {
        Logger.info("Deleting a Station");
        Member member = Accounts.getLoggedInMember();
        Station station = Station.findById(id);
        member.stations.remove(station);
        member.save();
        Logger.info("Removing" + station.name);
        station.delete();
        redirect("/dashboard");
    }

}


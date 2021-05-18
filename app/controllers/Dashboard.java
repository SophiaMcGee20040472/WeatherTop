package controllers;
import models.Reading;
import models.Station;
import play.mvc.*;
import play.Logger;

import java.util.ArrayList;
import java.util.List;


public class Dashboard extends Controller {

  public static void index() {
    Logger.info("Rendering Dashboard");

    List<Station> station = Station.findAll();
    render ("dashboard.html",station);

  }
}

package controllers;

import play.mvc.*;
import play.Logger;


public class Start extends Controller {
    public static void index() {
        Logger.info("Rendering Start");
        render("start.html");
    }
}

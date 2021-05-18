import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;
import models.*;

@OnApplicationStart
public class Bootstrap extends Job {
    public void doJob() {
        if (Member.count() == 0) {

            Fixtures.loadModels("data.yml");
        }
    }
}
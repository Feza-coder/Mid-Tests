import java.util.ArrayList;
import java.util.List;

public abstract class outsideJob implements Job {

    protected double salary;
    protected String startShift;
    protected String endShift;
    protected String jobDescription;
    protected List<Person> workers;


    public outsideJob(double salary, String startShift, String endShift, String jobDescription) {
        this.salary = salary;
        this.startShift = startShift;
        this.endShift = endShift;
        this.jobDescription = jobDescription;
        this.workers = new ArrayList<Person>();
    }


    
}
import java.util.ArrayList;
import java.util.List;

public class OutsideJob implements Job {
    protected double salary;
    protected String startShift;
    protected String endShift;
    protected String jobDescription;
    protected List<Person> workers;

    public OutsideJob(double salary, String startShift, String endShift, String jobDescription) {
        this.salary = salary;
        this.startShift = startShift;
        this.endShift = endShift;
        this.jobDescription = jobDescription;
        this.workers = new ArrayList<>();
    }

    @Override
    public double salary() {
        return salary;
    }

    @Override
    public String startShift() {
        return startShift;
    }

    @Override
    public String endShift() {
        return endShift;
    }

    @Override
    public void printJobDescription() {
        System.out.println("Job Description: " + jobDescription);
    }

    @Override
    public void printWorkers() {
        System.out.println("Our workers in this job are:");
        for (Person person : workers) {
            System.out.println("Name: " + person.getName());
        }
    }

    @Override
    public void hirePerson(Person person) {
        workers.add(person);
        System.out.println(person.getName() + " has been hired.");
    }

    @Override
    public void firePerson(Person person) {
        workers.remove(person);
        System.out.println(person.getName() + " has been fired.");
    }
}

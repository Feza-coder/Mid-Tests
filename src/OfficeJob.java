import java.util.ArrayList;
import java .util.List;
public class OfficeJob implements Job{
    protected double salary;
    protected String startShift;
    protected String endShift;
    protected String jobDescription;
    protected List<Person> workers;

    public OfficeJob(double salary, String startShift, String endShift, String jobDescription) {
        this.salary = salary;
        this.startShift = startShift;
        this.endShift = endShift;
        this.jobDescription = jobDescription;
        this.workers = new ArrayList<Person>();
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
    public String printJobDescription() {
        System.out.println("Job Description" +jobDescription);
    }

    @Override
    public void printWorkers (){
        System.out.println("Our woekers who are in the job are: ");
        for (Person person: workers){
            System.out.println("The name is : "+ person.getName());
        }
    }
    @Override
    public void hirePerson (Person person){
        workers.add(person);
        System.out.println(person.getName()+ "Hired");
    }
    @Override
    public void fireperon(Person person){
        workers.remove(person);
        System.out.println(person.getName()+ "Is fired");
    }
}


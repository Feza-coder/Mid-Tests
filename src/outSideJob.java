//Create OutsideJob abstract class implement Job
//implement necessarry functions from interface and create required fields

//double salary();
//    String startShift();
//    String endShift();
//    void printJobDescription();
//    void printWorkers();
//    void hirePerson(Person person);
//    void firePerson(Person person);



import java.util.List;

public abstract class outSideJob implements Job{
    protected String startSift;
   protected String endShift;
    protected double salary;
    protected List<Person> worker;
    protected String jobDescription;




    public outSideJob(String startSift, String endShift, double salary){
        this.startSift = startSift;
        this.endShift = endShift;
        this.salary = salary;
    }
    @Override
    public void printJobDescription(){
        System.out.println("description" + jobDescription);

    }
    @Override
   public void printWorkers(){
        for( Person person: worker){
            System.out.println("WORKER'S NAME" + person.getName());
        }

    }

public void hirePerson(Person person){
        worker.add(person){
        System.out.println("thie human is hired " + person.getName());
    }

}

public void firePerson(Person person){
        worker.remove(person){
        System.out.println("this Human is fired" + person.getName());
    }
}

}

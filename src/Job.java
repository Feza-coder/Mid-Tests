//Create Job Interface which have salary,
// startShift, endShift, printJobDescription,
// printWorkers, hirePerson, firePerson functions.

public interface Job {
    double salary();
    String startShift();
    String endShift();
    void printJobDescription();
    void printWorkers();
    void hirePerson(Person person);
    void firePerson(Person person);
}

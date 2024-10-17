public class Main {
    public static void main(String[] args) {
        // Create jobs
        SoftwareEngineer softwareEngineerJob = new SoftwareEngineer(5000, "9:00 AM", "5:00 PM");
        TaxiDriver taxiDriverJob = new TaxiDriver(3000, "6:00 AM", "8:00 PM");

    }


    Person[] people = {
        new Person("Alice", 28),
        new Person("Bob", 35),
        new Person("Charlie", 22),
        new Person("David", 45),
        new Person("Eva", 30),
        new Person("Frank", 40),
        new Person("Grace", 33),
        new Person("Helen", 27),
        new Person("Ian", 50),
        new Person("Judy", 38)
    }

        // Assign people to jobs
        for (int i = 0; i < 5; i++) {
            softwareEngineer.hirePerson(people[i]);
        }

        for (int i = 5; i < 10; i++) {
            taxiDriver.hirePerson(people[i]);
        }

        // Print job descriptions and workers
        System.out.println("Software Engineer Job:");
        softwareEngineerJob.printJobDescription();
        softwareEngineerJob.printWorkers();

        System.out.println("\nTaxi Driver Job:");
        taxiDriverJob.printJobDescription();
        taxiDriverJob.printWorkers();
    }



}
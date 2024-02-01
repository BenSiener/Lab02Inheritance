import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double hoursWorked;


        ArrayList<Worker> workersArray = new ArrayList<>();

        workersArray.add(new Worker("01", "John", "Doe", "Manager", 1985, 30.0));
        workersArray.add(new Worker("02", "Jane", "Smith", "Engineer", 1990, 25.0));
        workersArray.add(new Worker("03", "Bob", "Johnson", "Technician", 1988, 20.0));

        workersArray.add(new SalaryWorker("04", "Alice", "Johnson", "Director", 1975, 120000));
        workersArray.add(new SalaryWorker("05", "Charlie", "Brown", "Supervisor", 1980, 80000));
        workersArray.add(new SalaryWorker("06", "Eva", "Williams", "Coordinator", 1995, 60000));

        for (int week = 1; week <= 3; week++) {
            System.out.println("Week " + week + " Payroll:");

            for (Worker workerList : workersArray) {


                if (week == 2) {
                    hoursWorked = 50;
                } else {
                    hoursWorked = 40;
                }

                System.out.println(workerList.getFormalName() + ": " + workerList.getAge() + ": $" + workerList.calculateWeeklyPay(hoursWorked));

            }
            System.out.println();
        }
    }
}


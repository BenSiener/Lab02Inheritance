public class SalaryWorker extends Worker {

    double annualSalary;


    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, 0);
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked){
        return  annualSalary/52;
    }

    public String displayWeeklyPay(double hoursWorked){
        double weeklyPay;
        weeklyPay = annualSalary/52;

        return "Your weekly pay based off your salary is $" + weeklyPay;
    }
}

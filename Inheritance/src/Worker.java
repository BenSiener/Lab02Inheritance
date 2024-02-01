public class Worker extends Person{

    double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate) {
        super(ID, firstName, lastName, title, YOB);
        this.hourlyPayRate = hourlyPayRate;
    }


    public double calculateWeeklyPay(double hoursWorked)
    {
        double regularPay;
        double overtimePay;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * (1.5 * hourlyPayRate);
        }
        return regularPay + overtimePay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double regularPay;
        double overtimePay;
        double totalPay;
        double overtimeHours;

        if (hoursWorked <= 40) {
            regularPay = hoursWorked * hourlyPayRate;
            overtimePay = 0;
        } else {
            regularPay = 40 * hourlyPayRate;
            overtimePay = (hoursWorked - 40) * (1.5 * hourlyPayRate);
        }

        if (hoursWorked <= 40) {
             overtimeHours = 0;
        } else {
             overtimeHours = hoursWorked - 40;
        }

        totalPay = regularPay + overtimePay;

        return "You worked " + hoursWorked + " hrs. this week. You worked "
                + overtimeHours + " hrs. overtime this week. In total, you earned $"
                + totalPay + " this week.";
    }



}




import org.junit.Test;
import static org.junit.Assert.*;

public class SalaryWorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        SalaryWorker Paul = new SalaryWorker("01", "Paul", "John", "Hammered", 1980, 90000);
        System.out.println("$" + Paul.calculateWeeklyPay(40));
    }

    @Test
    public void testDisplayWeeklyPay() {
        SalaryWorker Paul = new SalaryWorker("01", "Paul", "John", "Hammered", 1980, 90000);
        System.out.println(Paul.displayWeeklyPay(40));
    }

}
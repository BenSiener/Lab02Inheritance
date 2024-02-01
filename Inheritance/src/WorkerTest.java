import org.junit.Test;
import static org.junit.Assert.*;

public class WorkerTest {

    @Test
    public void testCalculateWeeklyPay() {
        Worker Paul = new Worker("01", "Paul", "John", "Hammered", 1980, 44.00);
        double payAmount = Paul.calculateWeeklyPay(45);
        System.out.println("Paul got paid $" + payAmount);
    }

    @Test
    public void testDisplayWeeklyPay() {
        Worker Paul = new Worker("01", "Paul", "John", "Hammered", 1980, 44.00);
        System.out.println(Paul.displayWeeklyPay(45));
    }
}
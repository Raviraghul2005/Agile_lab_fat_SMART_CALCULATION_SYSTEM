import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class AppTest {

    private App service;

    @BeforeEach
    public void setUp() {
        service = new App();
    }

    @Test
    public void testNormalTariff() {
        double bill = service.calculateBill(10, false, 3);
        assertEquals(170.0, bill, 0.01);
    }

    @Test
    public void testPeakHourTariff() {
        double bill = service.calculateBill(10, true, 3);
        assertEquals(205.0, bill, 0.01);
    }

    @Test
    public void testHighTariff() {
        double bill = service.calculateBill(10, false, 7);
        assertEquals(205.0, bill, 0.01);
    }

    @Test
    public void testPeakAndHighTariff() {
        double bill = service.calculateBill(10, true, 8);
        assertEquals(240.0, bill, 0.01);
    }

    @Test
    public void testZeroUnits() {
        double bill = service.calculateBill(0, true, 8);
        assertEquals(100.0, bill, 0.01);
    }
}
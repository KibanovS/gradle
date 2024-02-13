import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldCorrectAmount() {
        assertEquals(service.remain(300), 700);

    }

    @Test
    public void shouldAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldAmountMoreThan1000() {
        assertEquals(service.remain(1400), 600);
    }

    @Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(service.remain(1000), 0);
    }
}

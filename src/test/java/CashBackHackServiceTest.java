import static org.testng.AssertJUnit.assertEquals;

public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldCorrectAmount() {
        assertEquals(service.remain(300), 700);

    }

    @org.testng.annotations.Test
    public void shouldAmountZero() {
        assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void shouldAmountMoreThan1000() {
        assertEquals(service.remain(1400), 600);
    }

    @org.testng.annotations.Test
    public void shouldBuyExtraIfTheAmount1000() {
        assertEquals(service.remain(1000), 0);
    }
}

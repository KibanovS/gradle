public class CashBackServiceTest {
    @T
    public void shouldCorrectAmount() {
        assertEquals(service.remain(300), 700);

    }

    @org.testng.annotations.Test

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

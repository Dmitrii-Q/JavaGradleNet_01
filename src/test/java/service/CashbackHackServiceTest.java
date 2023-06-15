package service;

import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    @Test
    public void cashBackLessMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void cashBackMoreMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void cashBackEqualMin() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }
}
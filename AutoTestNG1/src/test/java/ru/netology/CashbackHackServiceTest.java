package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void SouldReturnRemain700() {
        CashbackHackService remain = new CashbackHackService();

        int testAmount = 700;
        int expected = 300;
        int actual = remain.remain(testAmount);

        assertEquals(actual, expected);
    }

    @Test
    public void SouldReturnRemain1000() {
        CashbackHackService remain = new CashbackHackService();

        int testAmount = 0;
        int expected = 1000;
        int actual = remain.remain(testAmount);

        assertEquals(actual, expected);
    }

    @Test
    public void SouldReturnRemain1() {
        CashbackHackService remain = new CashbackHackService();

        int testAmount = 999;
        int expected = 1;
        int actual = remain.remain(testAmount);

        assertEquals(actual, expected);
    }

    @Test
    public void SouldReturnRemain999() {
        CashbackHackService remain = new CashbackHackService();

        int testAmount = 1001;
        int expected = 999;
        int actual = remain.remain(testAmount);

        assertEquals(actual, expected);
    }

    @Test
    public void SouldReturnRemain0() {
        CashbackHackService remain = new CashbackHackService();

        int testAmount = 1000;
        int expected = 0;
        int actual = remain.remain(testAmount);

        assertEquals(actual, expected);
    }


}

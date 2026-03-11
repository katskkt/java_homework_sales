package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    public void testTotalSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcTotalSale(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcAverageSale(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMaximumSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.getMonthMaximumSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthMinimumSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.getMonthMinimumSale(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthBellowAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcMonthBellowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testMonthAboveAverage() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();

        long actual = service.calcMonthAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}

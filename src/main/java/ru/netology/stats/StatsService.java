package ru.netology.stats;

public class StatsService {
    public long calcTotalSale(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
        return totalSale;
    }

    public long calcAverageSale(long[] sales) {
        return calcTotalSale(sales) / sales.length;
    }

    public int getMonthMaximumSale(long[] sales) {
        int currentMonthMAximum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[currentMonthMAximum] <= sales[i]) {
                currentMonthMAximum = i;
            }
        }
        return currentMonthMAximum + 1;
    }

    public int getMonthMinimumSale(long[] sales) {
        int currentMonthMinimum = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[currentMonthMinimum] >= sales[i]) {
                currentMonthMinimum = i;
            }
        }
        return currentMonthMinimum + 1;
    }

    public int calcMonthBellowAverage(long[] sales) {
        int counter = 0;
        long averageSale = calcAverageSale(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int calcMonthAboveAverage(long[] sales) {
        int counter = 0;
        long averageSale = calcAverageSale(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}

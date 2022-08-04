package ru.netology.stats;

import static java.lang.Long.sum;

public class StatsService {
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale: sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSalesAmount(long[] sales) {
        long sum = sumSales(sales);
        return (sum / sales.length);
    }



    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long belowAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        int count = 0;
        for(long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;

    }



    public long aboveAverage(long[] sales) {
        long average = averageSalesAmount(sales);
        int count = 0;
        for(long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;

    }
}

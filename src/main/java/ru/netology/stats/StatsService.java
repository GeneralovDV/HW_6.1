package ru.netology.stats;
public class StatsService {
    public int sumSales(int[] sales) {
        int[] arr = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int averageSalesAmount(int[] sales) {
        int[] arr = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
//        for (int i : arr) {
//            sum = sum + i;
        }
        return (int) (sum / arr.length);
    }

    public int maxSales(int[] sales) {
        int[] arr = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int[] arr = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int[] arr = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        int average = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) count++;
        }
        return count;

    }


    public int aboveAverage(int[] sales) {
        int[] arr = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = 0;
        int average = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        average = sum / arr.length;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average) count++;
        }
        return count;

    }
}

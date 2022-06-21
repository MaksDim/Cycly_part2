package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int calculateAvg(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMax(int[] sales) {
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

    public int findMin(int[] sales) {
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

    public int findMinAvgSales(int[] sales) {
        int avg = calculateSum(sales) / sales.length;
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale < avg) {
                month = month + 1;
            }
        }
        return month;
    }

    public int findMaxAvgSales(int[] sales) {
        int avg = calculateSum(sales) / sales.length;
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale > avg) {
                month = month + 1;
            }
        }
        return month;
    }
}

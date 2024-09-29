package ru.netology.stats;

public class StatsService {

    /*
     Возвращает сумму всех продаж.
     */
    public long calculateAllSales(long[] sales) {
        long totalSum = 0;
        for (long sale : sales) {
            totalSum += sale;
        }
        return totalSum;
    }
    /*
Возвращает среднюю сумму продаж в месяц
*/

    public long averageSalesPerMonth(long[] sales) {
        return calculateAllSales(sales) / 12;

    }

    /*
    Возвращает номер месяца, в котором был пик продаж
     */
    public int maxSalesMonth(long[] sales) {
        int maxIndex = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxIndex] <= sales[i]) {
                maxIndex = i;
            }
        }
        return maxIndex + 1;
    }

    /*
    Возвращает номер месяца, в котором был минимум продаж
     */
    public int minSalesMonth(long[] sales) {
        int minIndex = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minIndex] >= sales[i]) {
                minIndex = i;
            }

        }
        return minIndex + 1;
    }

    /*
    Возвращает количество месяцев, в которых продажи ниже среднего
     */
    public int monthsWithBelowAverageSales(long[] sales) {
        long averageSale = averageSalesPerMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    /*
    Возвращает количество месяцев, в которых продажи выше среднего
     */
    public int monthsWithAboveAverageSales(long[] sales) {
        long averageSale = averageSalesPerMonth(sales);
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale) {
                counter++;
            }

        }
        return counter;
    }
}

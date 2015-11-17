/**
 * Created by charlynbuchanan on 11/12/15.
 */

//TODO: Write an efficient function that takes stock_prices_yesterday and returns the
// best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

public class Profit {

    static int [] stockPrices = {10, 7, 5, 8, 11, 9};
    //Assuming the array represents prices in chronological order, and we must buy BEFORE we sell,
    // we must find the highest profit (biggest negative difference)of i - j
    //return absolute value of biggest negative difference

    public static int getMaxProfit(int [] array) {

        int profit = 0;
        int maxProfit = 0;


        for (int i = 0; i <  array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                //make sure that we're only keeping the profit, and we are subtracting in the right order
                if ((i < j) && array[i] - array[j] < 0) {
                    profit = array[i] - array[j];
                    //update maxProfit
                    if (profit < maxProfit){
                        maxProfit = profit;
                    }
                }
            }
        }
        System.out.println("Max Profit: $" + Math.abs(maxProfit));
        return Math.abs(maxProfit);
    }

    public static void main(String[] args)
    {
        getMaxProfit(stockPrices);
    }

}
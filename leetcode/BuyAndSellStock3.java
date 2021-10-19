package leetcode;

public class BuyAndSellStock3 {
public static void main(String[] args) {
	int[] prices = {1,2,4,2,5,7,2,4,9,0};
	/*
You are given an array prices where 
prices[i] is the price of a given stock on the ith day.
Find the maximum profit you can achieve. You may complete at most two transactions.
Note: You may not engage in multiple transactions simultaneously
 (i.e., you must sell the stock before you buy again).*/
	int firstBuy = Integer.MAX_VALUE;
    int afterFirstSell = 0;
    int afterSecondBuy = Integer.MIN_VALUE;
    int afterSecondSell = 0;
    for (int curPrice : prices) {
        firstBuy = Math.min(firstBuy, curPrice);
        afterFirstSell = Math.max(afterFirstSell ,curPrice-firstBuy);
        afterSecondBuy = Math.max(afterSecondBuy ,afterFirstSell - curPrice);
        afterSecondSell = Math.max(afterSecondSell ,afterSecondBuy + curPrice);
    }
    System.out.println(afterSecondSell);
}
}

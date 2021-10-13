package leetcode;

public class BuyAndSellStock3 {
public static void main(String[] args) {
	int[] prices = {1,2,4,2,5,7,2,4,9,0};
	int profit1=0,profit2=0;
    int maxProfit=0;
    int min = Integer.MAX_VALUE;
    for(int i=0; i<prices.length;i++){
        if(prices[i]<min){
            min = prices[i];
        }
        if(i!=prices.length-1){
            if(prices[i]>prices[i+1]){
                int p = prices[i]-min;
                if(profit1==0){
                    profit1 = p;
                    min= Integer.MAX_VALUE;
                }
                else if(profit2 ==0){
                    profit2 = p;
                    min= Integer.MAX_VALUE;
                }
                else if(profit1!=0 && profit1<p && profit1<profit2) {
                	profit1 = p;
                    min= Integer.MAX_VALUE;
                }
                else if(profit2!=0 && profit2<p && profit2<profit1){
                	profit2 = p;
                    min= Integer.MAX_VALUE;
                }
            }
        }
        else{
            int p = prices[i]-min;
            if(profit1 == 0) profit1=p;
            else if(profit2==0) profit2=p;
            else if(profit1<p) profit1=p;
            else if(profit2<p) profit2=p;
        }
        
    }
    maxProfit = profit1 + profit2;
    System.out.println(maxProfit);
}
}

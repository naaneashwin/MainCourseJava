package operators;

public class BestDayToBuyAndSell_A_Stock {
	public static void main(String[] args) {
		int p = maxProfit(new int[] {0,8,6,9,3,565});
		System.out.println(p);
	}
	    public static int maxProfit(int[] prices) {
	            int profit = 0;
	        if(prices.length>=1 && prices.length <=100000){
	            

	           for(int i=0; i<prices.length;i++){
	               if(prices[i]>=0 && prices[i]<=10000){
	                   for(int j=i+1;j<prices.length;j++){
	                       if(prices[j]-prices[i]>profit){
	                           profit = prices[j]-prices[i];
	                       }
	                   }
	                   
	                   
	               }
	           }
	            
	            
	        }
	        return profit;
	    }
	}


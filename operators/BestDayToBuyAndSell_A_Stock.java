package operators;

public class BestDayToBuyAndSell_A_Stock {
	public static void main(String[] args) {
		int p = maxProfit(new int[] {3,2,6,5,0,3});
		System.out.println(p);
	}
	    public static int maxProfit(int[] a) {
	        /*int profit = 0;
	        	for(int i=0; i<a.length;i++){
	        		for(int j=i+1;j<a.length;j++){
	                       if(a[j]-a[i]>profit){
	                           profit = a[j]-a[i];
	                       }
	                   }
	        		}
	        return profit;*/
	    	
	    	
	    	/*int profit=0;
	    	int maxindex = -1; 
	    	int minindex = -1;
	    	int max = -1;
	    	int min = 10001;
	    	for(int i=0; i<a.length;i++) {
	    		if(i!=0) {
	    			max = Math.max(max, a[i]);
	    			if(max == a[i]) {
	    				maxindex=i;
	    			}
	    		}
	    		if(i!=a.length-1) {
	    			min = Math.min(min, a[i]);
	    			if(min==a[i]) {
	    				minindex=i;
	    			}
	    		}
	    		if(minindex>maxindex) {
	    			max = -1;
	    		}
	    		if(max-min>profit && minindex<maxindex) {
	    			profit = max-min;
	    		}
	    	}
	    	
	    	
	    	return profit;*/ //{3,2,6,5,0,3}
	    	int maxprofit = 0;
	    	int min = Integer.MAX_VALUE;
	    	for(int i=0; i<a.length;i++) {
	    		if(a[i]<min) {
	    			min = a[i];
	    		}
	    		else if(a[i]-min>maxprofit) {
	    			maxprofit = a[i]-min;
	    		}
	    	}
	    	return maxprofit;
	    }
	}


package operators;

public class MedianOfArray {
	//FInd the median of two sorted arrays
	public static void main(String[] args) {
		int a[] = {1,2,3,4};
		int b[] = {2,5,9};
		System.out.println(findMedianSortedArrays(a,b));
	}
	    public static double findMedianSortedArrays(int[] a, int[] b) {
	        int[] result = new int[a.length + b.length];
	        int newTail = result.length-1;
	        int resultLength = result.length;
	        int tail1 = a.length-1;
	        int tail2 = b.length-1;
	        while(newTail>=0){
	            if(tail1>=0 && tail2>=0){
	                if(a[tail1]>b[tail2]){
	                result[newTail]=a[tail1];
	                tail1--;
	                }
		            else if(a[tail1]==b[tail2]){
		                result[newTail]=a[tail1];
		                newTail--;
		                result[newTail]=a[tail1];
		                tail1--;
		                tail2--;
		            }
		            else{
		                result[newTail]=b[tail2];
		                tail2--;
		            }
	            }
	                else if(tail1>=0 && tail2<0) {
	                	result[newTail]=a[tail1];
	                	tail1--;
	                }
	                else {
	                	result[newTail]=b[tail2];
	                	tail2--;
	                }
	            newTail--;
	            }
	        double median = 0;
	        if(resultLength%2==0){
	            int mid1 = resultLength/2;
	            int mid2 = (resultLength-2)/2;
	            median = ((double)result[mid1]+(double)result[mid2])/2;
	        }
	        else{
	            int mid = (resultLength-1)/2;
	            median = (double)result[mid];
	        }
	        return median;
	    }
}

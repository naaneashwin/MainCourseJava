package leetcode;

public class MaxEatenApples {
	public static void main(String[] args) {
		Son obj = new Son();
		int[] apples = {3,0,0,0,0,2};
		int[] days = {3,0,0,0,0,2};
		System.out.println(obj.eatenApples(apples, days));
	}
}
class Son {
    public int eatenApples(int[] apples, int[] days) {
        int minSum =0;
        int result = 0;
        int[] minArray = new int[apples.length];
        for(int i=0; i<apples.length; i++){
            minArray[i]=Math.min(apples[i],days[i]);
            minSum += Math.max(apples[i],days[i]);
        }
        int[] reStore = new int[minSum + apples.length];
        for(int i=0; i<minArray.length; i++){
            reStore[i+minArray[i]]=-minArray[i];
            if(i+minArray[i]>result){
                result = i+minArray[i];
            }
        }
        return result+1;
    }
}

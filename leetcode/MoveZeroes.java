package leetcode;

public class MoveZeroes {
	public static void main(String[] args) {
	//move all the zeroes in the array to right hand side
		//without altering the order of non zero elements 
		//use single array only
		int[] nums = {0,1,0,3,12};
		int b =nums.length-1;
        while(b>-1){
            if(nums[b]==0){
                for(int i=b; i<nums.length-1;i++){
                    nums[i]=nums[i+1];
                }
                nums[nums.length-1]=0;
            }
            b--;
        }
        for(int x:nums) {
        	System.out.println(x);
        }
	}
}

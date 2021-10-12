package leetcode;

public class ContainsDuplicateIII {
	public static void main(String[] args) {
		//Given an integer array nums and two integers k and t,
		//return true if there are two distinct indices i and j in the array 
		//such that abs(nums[i] - nums[j]) <= t and abs(i - j) <= k.
		int []nums = {-2147483648,2147483647};
		int t=1;
		int k=1;
		boolean flag = false;
        aa: for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<Math.min((i+k+1),nums.length);j++){
                if((Math.abs(i-j)<=k)){
                    if((Math.max(nums[i], nums[j])-(Math.min(nums[i], nums[j]))<=t)) {
                    	flag = true;
                        break aa;
                    }
                }
            }
        }
        //NOT COMPLETED
        System.out.println(flag);
	}
}

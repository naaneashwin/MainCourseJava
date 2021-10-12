package leetcode;

public class RotateArray {
	public static void main(String[] args) {
		int[] nums = {1,2,2};
		int k=7;
		int[] rotated = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
        	rotated[(i+nums.length+k)%nums.length] = nums[i];
        	
        }
        for(int i=0; i<nums.length;i++) {
        	System.out.println(rotated[i]);
        }
	}
}

package leetcode;

public class IntersectionOfSets {
	public static void main(String[] args) {
		int[] a = intersection(new int[] {1,2,2,1}, new int[] {2,2});
		for(int i=0; i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
        
        int count =0;
        int mc =0;
        int min = 0;
        if(nums1.length<nums2.length) {
        	min=nums1.length;
        }
        else min = nums2.length;
        int[] a = new int[min];
        int[] r = new int[min]; 
        for(int i=0; i<nums1.length;i++){
            int e1 = nums1[i];
            for(int j=0; j<nums2.length;j++){
                int e2 = nums2[j];
                if(e1==e2){
                    for(int k=count;k<min;){
                        System.arraycopy(nums2,j,a,k,1);
                        count++;
                        break;
                    }
                    break;
                }
            }
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]==a[j]){
                    continue;
                }
                else{
                    for(int k=mc; k<a.length;){
                        System.arraycopy(a,i,r,k,1);
                        mc++;
                        break;
                    }
                }
                
            }
        }
        return r;
    }
}

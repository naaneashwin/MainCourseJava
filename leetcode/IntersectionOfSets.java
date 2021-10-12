package leetcode;

public class IntersectionOfSets {
	public static void main(String[] args) {
		int[] a = intersection(new int[] {1,2,3,4,5}, new int[] {2,2});
		for(int i=0; i<a.length;i++){
			if(a[i]!=-1000001) {
				System.out.println(a[i]);
			}
		}
	}
	public static int[] intersection(int[] a, int[] b) {
        int r[]= new int[Math.min(a.length, b.length)];
        int k=0,count=0;
        for(int i=0; i<a.length;i++) {
        	for(int j=0;j<b.length;j++) {
        		if(a[i]==b[j]) {
            		r[k++]=a[i];
            		count++;
            		break;
            	}
        	}
        }
        for(int i=count;i<r.length;i++) {
        	r[i]=-1000001;
        }
        return r;
    }
}

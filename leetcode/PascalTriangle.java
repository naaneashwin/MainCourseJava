package leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class PascalTriangle {
	public static void main(String[] args) {
		System.out.println(generate(5));
	}
	public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li = new ArrayList<>();
        if(numRows==1){
            li.add(Arrays.asList(1));
            return li;
        }
        else if(numRows==2){
            li.add(Arrays.asList(1));
            li.add(Arrays.asList(1,1));
            return li;
        }
        for(int i=1; i<=numRows; i++){
            List<Integer> inner = new ArrayList<>();
            if(i==1){
                inner.add(1);
            }
            else if(i==2){
                inner.add(1);
                inner.add(1);
            }
            else{
                for(int j=1; j<=i; j++){
                    if(j==1 || j==i){
                        inner.add(1);
                    }
                    else{
                        inner.add(li.get(i-2).get(j-2) + li.get(i-2).get(j-1));
                    }
                }
            }
            li.add(inner);
           // inner.clear();
        }
        
        return li;
    }
}

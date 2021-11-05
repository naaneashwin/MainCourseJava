package leetcode;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class PositionOfLargeGroups {
	
	public static void main(String[] args) {
		System.out.println(largeGroupPositions("abcaaaaaaaa"));
	}
	
	public static List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> outside = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int first = 0;
            int last = 0;
            for(int j=i+1; j<s.length(); j++){
                char d = s.charAt(j);
                if(c==d){
                    first = i;
                    last =j;
                    
                }
                else{
                    i=j-1;
                    break;
                }
                
            }
            if(last-first>1){
                    outside.add(Arrays.asList(first,last));
                    i = last-1;
                }
        }
            
        return outside;
    }
}

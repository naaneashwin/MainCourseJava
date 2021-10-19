package hashmap;
import java.util.*;
public class RemoveAnKeyValueMethod {
	public static void main(String args[]) {
		HashMap<Integer,String> studentData = new HashMap<>();
		studentData.put(1,"A");
		studentData.put(2, "B");
		studentData.put(3,"C");
		studentData.put(4,"D");
		studentData.put(5, "E");
		
		
		for(Integer m : studentData.keySet()) {
			if(studentData.get(m).equals("D")) {
				studentData.remove(m);
				break;
			}				
		}
		System.out.println(studentData);
	}
}

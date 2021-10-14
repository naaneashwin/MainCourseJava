package strings;
import java.util.*;
public class HashMapExcercise1 {
	public static void main(String []args) {
		// Create a hasMap of integer and string as key and value respectively.
		//add 5 students with id and name.
	    //iterate of dataMap using keySet() and print all keys and their values.
	    /*ex->      key- 1  value-sanjay
	            key- 2    value- ashutosh
	            key- 3     value- nipun
	            key- 4     value- rabish
	            key- 5     value- akanksha*/
		HashMap<Integer,String> data = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size you need: ");
		int n = s.nextInt();
		s.nextLine();
		System.out.println("Enter the Key and respective Values: ");
		for(int i=0; i<n;i++) {
			Integer x = s.nextInt();
			s.nextLine();
			String str = s.nextLine();
			data.put(x,str);
		}
		for(Integer m: data.keySet()) {
			System.out.println("Key = "+m+"    Value = "+data.get(m));
		}
	}
}

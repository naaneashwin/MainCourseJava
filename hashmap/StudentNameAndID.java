package hashmap;
import java.util.*;
public class StudentNameAndID {
	public static void main(String[] args) {
		HashMap<Integer,String> studentData = new HashMap<>();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = s.nextInt();
		s.nextLine();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter the student name:");
			String str = s.nextLine();
			studentData.put(i,str);
		}
		for(Integer a:studentData.keySet()) {
			System.out.println("ID - "+a+" Student Name - "+studentData.get(a));
		}
	}
}

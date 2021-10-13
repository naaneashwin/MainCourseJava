package strings;

public class RemoveSpaces {
public static void main(String[] args) {
	String str = "The whitespaces in this string need to be removed";
	String spaceless = str.replaceAll(" ", "");
	System.out.println(spaceless);
}
}

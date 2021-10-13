package strings;

public class MaxAndMinOccurance {
	public static void main(String[] args) {
		//find the maximum and minimum  occurrence of a characters
		//if 2 or more characters occurred on the same number of times then print the first available number
		String str = "Tit for tat is a proverb";
		int max =0; 
		int min = 0;
		char ch1 = '\0';
		char ch2 = '\0';
		
		str = str.toLowerCase();
		for(int i=0; i<str.length();i++) {
			int count =1;
				if(str.charAt(i)>='a' && str.charAt(i)<='z') {
				for(int j=i+1; j<str.length();j++) {
					if(str.charAt(i)==str.charAt(j)) {
						count ++;						
					}
				}
				char ch = str.charAt(i);
				str = str.replace(str.charAt(i), '?');
				if(min ==0) {
					min = count;
					ch1 = ch;
				}
				else if(max==0 && min<count) {
					max = count;
					ch2 = ch;
				}
				else if(max==0 && min>count) {
					max = min;
					ch2 = ch1;
					min = count;
					ch1=ch;
				}
				else if(min>count) {
					min = count;
					ch1 = ch;
					
				}
				else if(max<count) {
					max = count;
					ch2 = ch;
				}
			}
		}
		System.out.println("Minimum occurred character is \'" +ch1 + "\' " + min+" times");
		System.out.println("Maximum occurred character is \'" +ch2 + "\' " + max+" times");
	}
}

package operators;

public class ConvertBinaryToDecimal {
	public static void main(String[] args) {
		System.out.println(getBinary(00000000000000000000000010000000));
	}
	public static int getBinary(int binary) {
		int decimal = 0;
		int power=0;
		while(true) {
			if(binary==0) {
				break;
			}
			else {
				int temp = binary%10;
				decimal = (int) (decimal + temp*(Math.pow(2, power)));
				binary/=10;
				power++;
			}
		}
		
		return decimal;
	}
}

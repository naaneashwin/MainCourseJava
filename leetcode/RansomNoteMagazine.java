package leetcode;

public class RansomNoteMagazine {
	public static void main(String[] args) {
		S obj = new S();
		System.out.println(obj.canConstruct("aab","baa"));
	}
}
class S {
    public boolean canConstruct(String ransomNote, String magazine) {
        int iR = 0;
        int count = 0;
        char[] mag = magazine.toCharArray();
        char[] ran = ransomNote.toCharArray();
        aa:while(iR<ran.length){
        	int  iM = 0;
            bb:while(iM<mag.length){
                if(mag[iM]==ran[iR]){
                    mag[iM]='?';
                    ran[iR]='>';
                    count++;
                    break bb;
                }
                
                else if(iM==mag.length-1){
                    count --;
                    break aa;
                }
                iM++;
            }
            iR++;
        }
        return count==ran.length?true:false;
    }
}
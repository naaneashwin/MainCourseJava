package Oops;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int a1 = s.nextInt();
        int b1 = s.nextInt();
        int a2 = s.nextInt();
        int b2 = s.nextInt();
        int sign = s.nextInt();
        s.close();
        
        ComplexNumbers c1 = new ComplexNumbers(a1,b1);
        ComplexNumbers c2 = new ComplexNumbers(a2,b2);
//        c1.setC(a1,b1);
//        c2.setC(a2,b2);
        if(sign ==1){
           ComplexNumbers.plus(c1,c2);
           
        }
        if(sign ==2){
          ComplexNumbers.multiply(c1,c2);
          
        }
        
        
    }
}
class ComplexNumbers{
    int a,b;
    
     public ComplexNumbers(int a1, int b1){
         a = a1;
         b = b1;
     }
    public static void plus(ComplexNumbers o1,ComplexNumbers o2){
        int x1 = o1.a;
        int y1 = o1.b;
        int x2 = o2.a;
        int y2 = o2.b;
        int x3 = x1+x2;
        int y3 = y1 + y2;
        System.out.println(x3 +" + i"+y3);
    }
    public static void multiply(ComplexNumbers o1,ComplexNumbers o2){
        int x1 = o1.a;
        int y1 = o1.b;
        int x2 = o2.a;
        int y2 = o2.b;
        int x3 = x1*x2;
        int y3 = x1*y2;
        int y4 = y1*x2;
        int x4 = y1*y2*(-1);
        int x = x3+x4;
        int y = y3+y4;
        System.out.println(x+" + i"+y);
    }
    
    
}

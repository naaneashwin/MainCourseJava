package com.java.syntax;
public class DiamondPattern {
	public static void main (String args[]) {
		int i,j,row=10;
		for (i=0; i<row;i++) {
			{
				for (j=row-i;j>1;j--) {
					System.out.print(" ");
				}
				for (j=0; j<=i;j++) {
					System.out.print("# ");
				}
			}
			System.out.println();
		
		}
		int k,l;
		for (k=row-1 ; k>0;k--) {
			{
				for(l=1;l<=row-k;l++ ) {
					System.out.print(" ");
				}
				for(l=k; l>0;l--) {
					System.out.print("# ");
				}
			}
			System.out.println();
		}
	}
}

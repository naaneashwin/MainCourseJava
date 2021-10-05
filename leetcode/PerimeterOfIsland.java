package leetcode;

//import java.util.ArrayList;

public class PerimeterOfIsland {
public static void main(String[] args) {
	//ArrayList<int[]> list = new ArrayList<int[]>();
	/*int[] i = {0,1,0,0};
	int[] j = {1,1,1,0};
	int[] k = {0,1,0,0};
	int[] l = {1,1,0,0};
	list.add(i);
	list.add(j);
	list.add(k);
	list.add(l);
	int add=0;
	
	for(int a=0; a<i.length;a++) {
		if(i[a]==0) {
			add = add + 0;
		}
		else {
			add = add+4;
			if(i[a+1]==1) {
				add = add-1;
			}
			if(a!=0 && i[a-1]==1) {
				add = add-1;
			}
			if(j[a]==1) {
				add = add-1;
			}
		}
		
	}
	for(int a=0; a<j.length;a++) {
		if(j[a]==0) {
			add = add + 0;
		}
		else {
			add = add+4;
			if(j[a+1]==1) {
				add = add-1;
			}
			if(a!=0 && j[a-1]==1) {
				add = add-1;
			}
			if(k[a]==1) {
				add = add-1;
			}
			if(i[a]==1) {
				add = add-1;
			}
		}
		
	}
	for(int a=0; a<k.length;a++) {
		if(k[a]==0) {
			add = add + 0;
		}
		else {
			add = add+4;
			if(k[a+1]==1) {
				add = add-1;
			}
			if(a!=0 && k[a-1]==1) {
				add = add-1;
			}
			if(l[a]==1) {
				add = add-1;
			}
			if(j[a]==1) {
				add = add-1;
			}
		}
		
	}
	for(int a=0; a<l.length;a++) {
		if(l[a]==0) {
			add = add + 0;
		}
		else {
			add = add+4;
			if(l[a+1]==1) {
				add = add-1;
			}
			if(a!=0 && l[a-1]==1) {
				add = add-1;
			}
			if(k[a]==1) {
				add = add-1;
			}
		}
		
	}
	System.out.println(add);
	*/
	/* using list
	int perimeter=0;
	for(int i=0; i<list.size();i++) {
		int[] a = list.get(i);
		int[] b = new int[a.length];
		int[] c = new int[a.length];
		int m = 0,n=0;
		
		if(i!=0) {
			b = list.get(i-1);
			}
		if(i!=list.size()) {
			c = list.get(i+1);
			}
		
		for(int j=0; j<a.length;j++) {
			if(a[j]==0) {
				perimeter = perimeter + 0;
			}
			else {
				perimeter = perimeter + 4;
				if(j!=0 && a[j-1]==1) {
					perimeter = perimeter - 1;
				}
				if(a[j+1]==1) {
					perimeter = perimeter - 1;
				}
				for(int x =0; x<b.length;) {
					if(b[j]==1) {
						m=1;
						break;
					}
					else {
						m=0;
						break;
					}
				}
				for(int x =0; x<c.length;) {
					if(c[j]==1) {
						n=1;
						break;
					}
					else {
						n=0;
						break;
					}
				}
				if(m==1) {
					perimeter = perimeter - 1;
				}
				if(n==1) {
					perimeter = perimeter - 1;
				}
			}
		}
	}*/
	//for matrix
	int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
	int row = grid.length;
	int column = 0;
	int add = 0;
	for(int i=0; i<row ; i++) {
		column = grid[i].length;
		for(int j=0;j<column;j++) {
			if(grid[i][j]==0) {
				add = add +0;
			}
			else {
				add = add + 4;
				if(i!=0 && grid[i-1][j]==1) {
					add = add -1;
				}
				if(i!= row-1 && grid[i+1][j]==1) {
					add = add -1;
				}
				if(j!=0 && grid[i][j-1]==1) {
					add = add -1;
				}
				if(j!= column-1 && grid[i][j+1]==1) {
					add = add -1;
				}
			}
		}
	}
	System.out.println(add);
	
}
}


public class A1H20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},
			    {4,5,6},
			    {7,8,9}};
		int[][] b= {{1,2,3},
			    {4,5,6},
			    {7,8,9}};
		int[][] c=new int[a.length][a[0].length];
		int i=0;
		loopI(i,a,b,c);
		int l=0;
		loopl(l,c);
		

	}

	private static void loopl(int l, int[][] c) {
		// TODO Auto-generated method stub
		if(l<c.length)
		{
			int m=0;
			loopm(l,m,c);
			System.out.println();
			l++;
			loopl(l, c);
		}
		
	}

	private static void loopm(int l, int m, int[][] c) {
		// TODO Auto-generated method stub
		if(m<c.length)
		{
			System.out.print(c[l][m]+" ");
			m++;
			loopm(l, m, c);
		}
		
	}

	private static void loopI(int i, int[][] a, int[][] b, int[][] c) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=0;
			loopJ(i,j,a,b,c);
			i++;
			loopI(i,a,b,c);
		}
		
	}

	private static void loopJ(int i,int j, int[][] a, int[][] b, int[][] c) {
		// TODO Auto-generated method stub
		if(j<a[0].length)
		{
			c[i][j]=c[i][j]+(a[i][j]+b[i][j]);
			j++;
			loopJ(i,j,a,b,c);
		}
		
	}

}

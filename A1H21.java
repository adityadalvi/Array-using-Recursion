//subtraction
public class A1H21 {

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
		//convert these loops into recursion
		for (int l = 0; l < c.length; l++) 
		{
			for (int m = 0; m < c.length; m++) 
			{
				System.out.print(c[l][m]+" ");
			}
			System.out.println();
			
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
			c[i][j]=c[i][j]-(a[i][j]-b[i][j]);
			j++;
			loopJ(i,j,a,b,c);
		}
		
	}

}
//multiplication
/*
public class A1H21 {

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
		//convert these loops into recursion
		for (int l = 0; l < c.length; l++) 
		{
			for (int m = 0; m < c.length; m++) 
			{
				System.out.print(c[l][m]+" ");
			}
			System.out.println();
			
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
			c[i][j]=c[i][j]-(a[i][j]-b[i][j]);
			j++;
			loopJ(i,j,a,b,c);
		}
		
	}

}*/



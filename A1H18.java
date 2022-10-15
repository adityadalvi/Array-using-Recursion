
public class A1H18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		int i=0;
		loopI(i,a);
	}

	private static void loopI(int i, int[][] a) 
	{
		if(i<a.length)
		{
			int j=0;
			loopJ(i,j,a);
			System.out.println();
			i++;
			loopI(i,a);
		}
		
	}

	private static void loopJ(int i, int j, int[][] a) 
	{
		if(j<a.length)
		{
			System.out.print(a[i][j]+" ");
			j++;
			loopJ(i,j,a);
		}
		
	}

}

//10) Write a program to find maximum element in a matrix. (Variations)
public class A1H10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,11},
				{4,5,6},
				{7,8,9}};
		int i=0;
		int max=0;
		max=loopI(i,a,max);
		System.out.println(max);
		


	}

	private static int loopI(int i,int[][] a,int max) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=0;
			max=loopJ(i,j,a,max);
			i++;
			return loopI(i,a,max);
		}
		return max;
	}

	private static int loopJ(int i, int j, int[][] a,int max) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[i][j]>max)
			{
				max=a[i][j];
			}
			j++;
			return loopJ(i,j,a,max);
		}
		return max;
	}
	
}

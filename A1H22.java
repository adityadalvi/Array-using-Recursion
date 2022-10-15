
public class A1H22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{1,2,3,4},
					{4,5,6,4},
					{7,8,9,4},
					{1,1,1,1}};
		int i=0;
		loopI(i,a);

	}

	private static void loopI(int i, int[][] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=0;
			loopJ(i,j,a);
			System.out.println();
			i++;
			loopI(i,a);
		}
		
	}

	private static void loopJ(int i, int j, int[][] a) {
		// TODO Auto-generated method stub
		if(j<a[0].length)
		{
			if((i==0||i==a.length-1)||(j==0||(j==a[0].length-1&&i>0&&i<3)))
			{
				System.out.print(a[i][j]);
			}
			else
			{
				System.out.print(" ");
			}
			j++;
			loopJ(i,j,a);
		}
	}

}


public class A1H30 {

	static int sum = 0;
	static int cnt = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { { 1, 2, 3 }, 
					{ 4, 10, 6 },
					{ 7, 8, 19 }

		};
		int i=0;
		sum=loopi(i,a,sum,cnt);
		System.out.println(sum);
		System.out.println("Avg:"+(sum/cnt));

	}

	private static int loopi(int i, int[][] a,int sum,int cnt) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=0;
			sum=loopj(i,j,a,sum,cnt);
			i++;
			return loopi(i, a,sum,cnt);
		}
		return sum;
		
	}

	private static int loopj(int i, int j, int[][] a, int sum2, int cnt2) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(j-i==0||j+i==a.length-1)
			{
			sum=sum+a[i][j];
			cnt++;
			}
			j++;
			return loopj(i, j, a, sum2, cnt2);
		}
		return sum;
		
	}

}

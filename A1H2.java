
public class A1H2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {101,102,103,104,105};
		int num=107;
		int cnt=0;
		int i=0;
		int res=loopI(i,a,cnt,num);
		if(res!=0)
		{
			System.out.println("number available in given array");
		}
		else
		{
			System.out.println("Number not found");
		}
	}

	private static int loopI(int i, int[] a, int cnt, int num)
	{
		if(i<a.length)
		{
			if(num==a[i])
			{
				cnt++;
				return 1;
			}
			i++;
			loopI(i,a,cnt,num);
		}
		return cnt;
		
		
	}

}

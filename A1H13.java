
public class A1H13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,4};
		if(a.length!=b.length)
		{
			System.out.println("not same");
		}
		else
		{
			int cnt=0;
			int i=0;
			cnt=loopI(i,cnt,a,b);
			if(cnt==0)
			{
				System.out.println("same");
			}
			else
			{
				System.out.println("not same");
			}
		}

	}

	private static int loopI(int i, int cnt, int[] a,int[] b) 
	{
		if(i<a.length)
		{
			if(a[i]!=b[i])
			{
				cnt++;
				
			}
			i++;
			return loopI(i,cnt,a,b);
		}
		return cnt;
	}

}

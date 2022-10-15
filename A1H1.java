
public class A1H1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int num=1;
		int i=0;
		int cnt=0;
		cnt=loopI(i,a,num,cnt);
		if(cnt==0)
		{
			System.out.println("not found");
		}

	}

	private static int loopI(int i,int[] a,int num,int cnt) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			if(num==a[i])
			{
				System.out.println(i);	
				cnt++;
			}
			i++;
			return loopI(i,a,num,cnt);
			
		}
		return cnt;
	
		
	}

}

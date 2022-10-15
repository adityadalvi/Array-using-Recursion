
public class A1H14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,15,13,2};
		int i=0;
		loopI(i,a);
		

	}

	private static void loopI(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int cnt=0;
			int j=i+1;
			cnt=loopJ(i,j,a,cnt);
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
			i++;
			loopI(i,a);
		}
	}

	private static int loopJ(int i, int j, int[] a, int cnt) {
		if(j<a.length)
		{
			if(a[i]<a[j])
			{
				cnt++;
			}
			j++;
			return loopJ(i,j,a,cnt);
		}
		return cnt;
		
	}

}

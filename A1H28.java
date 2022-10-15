
public class A1H28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,1,1,1,1,2,2,3,4};
		int[] n= {1,2,4};
		int i=0;
		a=loopi(i,n,a);
		for (i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}

	}

	private static int[] loopi(int i, int[] n, int[] a) {
		// TODO Auto-generated method stub
		if(i<n.length)
		{
			int cnt=0;
			int j=0;
			cnt=loopj(i,j,cnt,a,n);
			int[] b=new int[a.length-cnt];
			int ind=0;
			int rcnt=0;
			int k=0;
			loopk(k,i,a,n,rcnt,b,ind);
			a=b;
			
			i++;
			return loopi(i, n, a);
		}
		return a;
		
	}

	private static void loopk(int k, int i, int[] a, int[] n, int rcnt, int[] b, int ind) {
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			if(a[k]!=n[i]||rcnt>=2)
			{
				b[ind++]=a[k];
			}
			else
			{
				rcnt++;
			}
			k++;
			loopk(k, i, a, n, rcnt, b, ind);
		}
		
	}

	private static int loopj(int i, int j, int cnt, int[] a,int[] n) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[j]==n[i])
			{
				cnt++;
			}
			if(cnt==2)
			{
				cnt=2;
				return cnt;
			}
			j++;
			return loopj(i, j, cnt, a,n);
		}
		return cnt;
		
	}

}

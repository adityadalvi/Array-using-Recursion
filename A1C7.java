
public class A1C7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,2,3,5,6,7};
		int i=0;
		int cnt=0;
		cnt=loopi(i,a,cnt);
		int[] b=new int[a.length-cnt];
		int ind=0;
		int m=0;
		loopm(m,a,ind,b);
		int p=0;
		loopp(p,b);
		System.out.println();
		int r=0;
		loopr(r,b);
		
 
	}

	private static void loopr(int r, int[] b) {
		// TODO Auto-generated method stub
		if(r<b.length)
		{
			int s=r+1;
			loops(r,s,b);
			r++;
			loopr(r, b);
		}
		
	}

	private static void loops(int r, int s, int[] b) {
		// TODO Auto-generated method stub
		if(s<b.length)
		{
			System.out.println(b[r]+" "+b[s]);
			s++;
			loops(r, s, b);
		}
		
	}

	private static void loopp(int p, int[] b) {
		// TODO Auto-generated method stub
		if(p<b.length)
		{
			System.out.print(b[p]+" ");
			p++;
			loopp(p, b);
		}
		
	}

	private static void loopm(int m, int[] a,int ind,int[] b) {
		// TODO Auto-generated method stub
		if(m<a.length)
		{
			int cnt1=0;
			int n=0;
			cnt1=loopn(m,n,cnt1,a);
			if(cnt1==0)
			{
				b[ind++]=a[m];
			}
			m++;
			loopm(m, a,ind,b);
		}
		
	}

	private static int loopn(int m, int n, int cnt1,int[] a) {
		// TODO Auto-generated method stub
		if(n<m)
		{
			if(a[m]==a[n])
			{
				cnt1++;
			}
			n++;
			return loopn(m, n, cnt1,a);
		}
		return cnt1;
	}

	private static int loopi(int i, int[] a,int cnt) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=i+1;
			cnt=loopj(i,j,cnt,a);
			i++;
			return loopi(i, a,cnt);
		}
		return cnt;
		
	}

	private static int loopj(int i, int j, int cnt, int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[i]==a[j])
			{
				cnt++;
			}
			j++;
			return loopj(i, j, cnt, a);
		}
		return cnt;
		
	}

}

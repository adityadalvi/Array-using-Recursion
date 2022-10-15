
public class A1H27try {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= {{6,3,9},
				{9,7,8},
				{2,4,5}};
		int cnt=0;
		int i=0;
		cnt=loopi(i,cnt,a);
		if(cnt==0)
		{
			System.out.println("No saddle point");
		}
	}

	private static int loopi(int i, int cnt, int[][] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=0;
			cnt=loopj(i,j,cnt,a);
			i++;
			return loopi(i, cnt, a);
		}
		return cnt;

	}

	private static int loopj(int i, int j, int cnt, int[][] a) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			int s=0;
			int k=0;
			s=loopk(i,j,k,s,a,cnt);
			if(s==0)
			{
				int l=0;
				int m=0;
				l=loopm(i,j,k,l,m,a);
				
				if(l==0)
				{
					System.out.println(a[i][j]);
					cnt++;
				}
			}
			j++;
			return loopj(i, j, cnt, a);
		}
		return cnt;

	}

	private static int loopm(int i, int j, int k, int l, int m, int[][] a) {
		// TODO Auto-generated method stub
		if(m<a.length)
		{
			if(a[i][j]<a[m][j])
			{
				l++;
			}
			m++;
			return loopm(i, j, k, l, m, a);
		}
		return l;
		
	}

	private static int loopk(int i, int j, int k, int s, int[][] a, int cnt) {
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			if(a[i][j]>a[i][k])
			{
				s++;
			}
			k++;
			return loopk(i, j, k, s, a, cnt);
		}
		return s;

	}
}

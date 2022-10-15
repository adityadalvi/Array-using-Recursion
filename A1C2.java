
public class A1C2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {41,42,43,44,45,46};
		int s=0;
		int e=a.length-1;
		int mid=(s+e)/2;
		int num=99;
		int cnt=0;
		cnt=loopi(s,e,mid,a,num,cnt);
		if(cnt==0)
		{
			System.out.println("not found");
		}
		
	}
	private static int loopi(int s,int e,int mid,int[] a,int num,int cnt)
	{
		if(s<=e)
		{
			if(num==a[mid])
			{
				System.out.println("found at index: "+mid);
				cnt++;
				return cnt;
			}
			else if(num>a[mid])
			{
				s=mid+1;
			}
			else
			{
				e=mid-1;
			}
			mid=(s+e)/2;
			return loopi(s, e, mid, a, num,cnt);
		}
		return cnt;
	}

}

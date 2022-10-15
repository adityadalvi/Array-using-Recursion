
public class A1H3TRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int num=4;
		int cnt=0;
		int i=0;
		cnt=loopi(i,a,cnt,num);
		int[] b=new int[a.length-cnt];
		int ind=0;
		int j=0;
		loopj(j,a,ind,b,num);
		int k=0;
		loopk(k,b);
		

	}

	private static void loopk(int k, int[] b) {
		// TODO Auto-generated method stub
		if(k<b.length)
		{
			System.out.print(b[k]+" ");
			k++;
			loopk(k, b);
		}
		
	}

	private static void loopj(int j, int[] a, int ind, int[] b,int num) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[j]!=num)
			{
				b[ind++]=a[j];
			}
			j++;
			loopj(j, a, ind, b, num);
		}
		
	}

	private static int loopi(int i, int[] a, int cnt,int num) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			if(a[i]==num)
			{
				cnt++;
			}
			i++;
			return loopi(i, a, cnt,num);
			
		}
		return cnt;
		
	}

}

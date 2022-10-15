
public class A1H12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,6};
		int cnt=0;
		int i=0;
		cnt=loopI(i,a,cnt);
		int evenind=0;
		int oddind=0;
		int[] even=new int[cnt];
		int[] odd=new int[a.length-cnt];
		
		int j=0;
		even=loopJ(j,evenind,even,a);
		for (int j2 = 0; j2 < even.length; j2++)
		{
			System.out.print(even[j2]+" ");
		}
		System.out.println();
		int k=0;
		odd=loopK(k,oddind,odd,a);
		for (int j2 = 0; j2 < odd.length; j2++)
		{
			System.out.print(odd[j2]+" ");
		}
		
	}

	private static int[] loopK(int k, int oddind, int[] odd, int[] a) {
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			if(a[k]%2!=0)
			{
				odd[oddind++]=a[k];
			}
			k++;
			loopK(k,oddind,odd,a);
		}
		return odd;
		
	}

	private static int[] loopJ(int j, int evenind, int[] even,int[] a) {
		if(j<a.length)
		{
			if(a[j]%2==0)
			{
				even[evenind++]=a[j];
			}
			j++;
			loopJ(j,evenind,even,a);
		}
		return even;
	}

	private static int loopI(int i, int[] a, int cnt) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			if(a[i]%2==0)
			{
				cnt++;
			}
			i++;
			return loopI(i,a,cnt);
		}
		return cnt;
		
	}

}

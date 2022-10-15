
public class A1H29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {5,1,3,4,7};
		int i=0;
		loopi(i,a);
		
	}

	private static void loopi(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=i+1;
			loopj(i,j,a);
			i++;
			loopi(i, a);
		}
		
	}

	private static void loopj(int i, int j, int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			int k=j+1;
			loopk(i,j,k,a);
			j++;
			loopj(i, j, a);
		}
		
	}

	private static void loopk(int i, int j, int k, int[] a) {
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			if(a[i]+a[j]+a[k]<12)
			{
				System.out.println(a[i]+" "+a[j]+" "+a[k]);
			}
			k++;
			loopk(i, j, k, a);
		}
		
	}

}

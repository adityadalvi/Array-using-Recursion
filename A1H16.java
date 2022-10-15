
public class A1H16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,0,1,0,1,0,1};
		int i=0;
		loopI(i,a);
		int j=0;
		loopJ(j,a);
	}

	private static void loopJ(int j, int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			System.out.print(a[j]+" ");
			j++;
			loopJ(j,a);
		}
	}

	private static void loopI(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			if(a[i]==0)
			{
				a[i]=1;
			}
			i++;
			loopI(i,a);
		}
		
	}

}

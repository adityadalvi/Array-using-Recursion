
public class A1C5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,-2,3,-4,5,-1,2,-3,4,-5};
		int[] b=new int[a.length];
		int ind=0;
		int i=0;
		ind=loopi(i,a,b,ind);
		int j=0;
		loopj(j,a,b,ind);
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

	private static void loopj(int j, int[] a, int[] b, int ind) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[j]<0)
			{
				b[ind++]=a[j];
			}
			j++;
			loopj(j, a, b, ind);
		}
		
	}

	private static int loopi(int i, int[] a, int[] b, int ind) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			if(a[i]>0)
			{
				b[ind++]=a[i];
			}
			i++;
			return loopi(i, a, b, ind);
		}
		return ind;
		
	}

}

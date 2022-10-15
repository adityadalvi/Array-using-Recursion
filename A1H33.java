
public class A1H33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		int[] c=new int[a.length+b.length];
		int ind=0;
		int i=0;
		ind=loopi(i,a,c,ind);
		int j=0;
		loopj(j,b,c,ind);
		int k=0;
		loopk(k,c);
	}

	private static void loopj(int j, int[] b, int[] c,int ind) {
		// TODO Auto-generated method stub
		if(j<b.length)
		{
			c[ind++]=b[j];
			j++;
			loopj(j, b, c,ind);
		}
		
	}

	private static int loopi(int i, int[] a, int[] c,int ind) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			c[ind++]=a[i];
			i++;
			return loopi(i, a, c,ind);
		}
		return ind;	
	}
	private static void loopk(int k,int[] c)
	{
		if(k<c.length)
		{
			System.out.print(c[k]+" ");
			k++;
			loopk(k, c);
		}
	}

}

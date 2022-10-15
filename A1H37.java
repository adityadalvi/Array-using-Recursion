
public class A1H37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,7,3,1,2};
		int i=0;
		loopi(i,a);
		int k=0;
		loopk(k,a);
	}

	private static void loopk(int k, int[] a) {
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			System.out.print(a[k]+" ");
			k++;
			loopk(k, a);
		}
		
	}

	private static void loopi(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length-1)
		{
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
			i++;
			loopi(i, a);
		}
		
	}

}

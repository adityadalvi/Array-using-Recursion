import java.util.concurrent.ForkJoinPool;

public class A1H4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		int i=0;
		int[] c=loopI(i,a,b);
		int j=0;
		loopJ(j,c);
		

	}
	private static int[] loopI(int i, int[] a, int[] b) 
	{
		if(i<a.length)
		{
			b[i]=a[i];
			i++;
			loopI(i,a,b);
			
		}
		return b;
		
	}
	

	private static void loopJ(int j, int[] c) {
		// TODO Auto-generated method stub
		if(j<c.length)
		{
			System.out.print(c[j]+" ");
			j++;
			loopJ(j,c);
		}
		
	}

	
	

}

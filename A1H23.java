//rotate left
public class A1H23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int[] b=new int[a.length];
		int i=0;
		int temp=a[0];
		b=loopI(i,a);
		b[b.length-1]=temp;
		int j=0;
		loopJ(j,b);
		

	}

	private static void loopJ(int j,int[] b) {
		// TODO Auto-generated method stub
		if(j<b.length)
		{
			System.out.print(b[j]+" ");
			j++;
			loopJ(j,b);
		}
		
		
	}

	private static int[] loopI(int i, int[] a) 
	{
		// TODO Auto-generated method stub
		if(i<a.length-1)
		{
			a[i]=a[i+1];
			i++;
			loopI(i,a);
		}
		return a;
		
	}

}

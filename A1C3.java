
public class A1C3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,7,3,1,2};
		int i=0;
		loopi(i,a);
		/*for (int i = 0; i < a.length; i++) 
		{
			
			
		}*/
		for (i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		
	
	}

	private static void loopi(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int min=i;
			int j=i+1;
			min=loopj(i,j,a,min);
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			i++;
			loopi(i, a);
		}
		
	}

	private static int loopj(int i, int j, int[] a, int min) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[min]>a[j])
			{
				min=j;
			}
			j++;
			return loopj(i, j, a, min);
			
		}
		return min;
		
	}

}

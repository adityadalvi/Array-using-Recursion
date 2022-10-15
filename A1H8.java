//Write a program to find the second largest element in an array (Variations)
public class A1H8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,4,5,2,6,9};
		int max=Integer.MIN_VALUE;
		int i=0;
		max=loopi(i,a,max);
		int max1=0;
		int j=0;
		max1=loopj(max,j,max1,a);
		System.out.println(max1);
		
		
		

	}

	private static int loopj(int max, int j, int max1,int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[j]!=max&&a[j]>max1)
			{
				max1=a[j];
			}
			j++;
			return loopj(max, j, max1, a);
		}
		return max1;
		
	}

	private static int loopi(int i, int[] a, int max) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			i++;
			return loopi(i, a, max);
		}
		return max;
		
	}

	

	

}

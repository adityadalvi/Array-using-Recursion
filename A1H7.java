//7) Write a program sort array elements in ascending order using bubble sort.
public class A1H7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,7,3,2,1};
		int i=0;
		loopI(i,a);
		for (int j = 0; j < a.length; j++) 
		{
			System.out.print(a[j]+" ");
		}

	}

	private static void loopI(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=0;
			loopJ(j,a);
			i++;
			loopI(i,a);
		}
		
	}

	private static int[] loopJ(int j, int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length-1)
		{
			if(a[j]>a[j+1])
			{
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
			j++;
			loopJ(j,a);
		}
		return a;
		
	}

}

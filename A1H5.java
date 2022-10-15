//5) Write a program to find and display reverse of an array using third variable.
public class A1H5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5};
		int i=0;
		int j=a.length-1;
		loopI(i,j,a);
		int k=0;
		loopK(k,a);
	}

	private static void loopK(int k, int[] a) {
		// TODO Auto-generated method stub
		if(k<a.length)
		{
			System.out.print(a[k]+" ");
			k++;
			loopK(k,a);
		}
		
	}

	private static void loopI(int i, int j,int[] a) {
		// TODO Auto-generated method stub
		if(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
			loopI(i,j,a);
		}
		
	}

}

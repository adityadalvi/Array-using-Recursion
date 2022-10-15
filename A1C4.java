
public class A1C4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,7,3,9,7,45,5,55,1,2};
		int i=1;
		loopi(i,a);
		for (i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	private static void loopi(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int temp=a[i];
			int j=i-1;
			loopj(j,temp,a);
			i++;
			loopi(i, a);
		}
		
	}

	private static void loopj(int j, int temp, int[] a) {
		// TODO Auto-generated method stub
		if(j>=0&&temp<a[j])
		{
			a[j+1]=a[j];
			j--;
			a[j+1]=temp;
			loopj(j, temp, a);
		}
		
		
	}

}


























/*

*/

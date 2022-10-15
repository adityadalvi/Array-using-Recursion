
public class A1C1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4,5,67};
		int i=0;
		double sum=0;
		sum=loopi(i,sum,a);
		System.out.println(sum);
	}

	private static double loopi(int i, double sum, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			sum=sum+a[i];
			i++;
			return loopi(i, sum, a);
		}
		return sum;
		
	}


}

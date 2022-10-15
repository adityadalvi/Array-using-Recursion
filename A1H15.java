
public class A1H15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {8,7,3,1,2};
		int i=0;
		loopI(i,a);
		System.out.println("samllest element:"+a[0]);
		System.out.println("Largest element:"+a[a.length-1]);
	}

	private static void loopI(int i, int[] a) {
		// TODO Auto-generated method stub
		if(i<a.length)
		{
			int j=i+1;
			loopJ(i,j,a);
			i++;
			loopI(i,a);
		}
		
	}

	private static void loopJ(int i, int j, int[] a) {
		// TODO Auto-generated method stub
		if(j<a.length)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j++;
			loopJ(i,j,a);
		}
		
	}

}

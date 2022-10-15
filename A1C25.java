
public class A1C25 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,7,90,20,5,50,40};
		int k=3;
		int i=0;
		int min=Integer.MAX_VALUE;
		int minind=0;
		Data1 obj=null;
		obj=loopi(i,a,k,min,minind,obj);
		System.out.println(obj.min+" "+obj.minind);
		

	}

	private static Data1 loopi(int i, int[] a, int k, int min, int minind,Data1 obj) {
		// TODO Auto-generated method stub
		if(i<a.length-k+1)
		{
			int sum=0;
			int j=i;
			sum=loopj(j,i,k,sum,a);
			int avg=sum/k;
			if(avg<min)
			{
				min=avg;
				minind=i;
				
			}
			obj=new Data1(min,minind);
			i++;
			return loopi(i, a, k, min, minind, obj);
		}
		return obj;
		
	}

	private static int loopj(int j, int i, int k, int sum, int[] a) {
		// TODO Auto-generated method stub
		if(j<i+k)
		{
			sum=sum+a[j];
			j++;
			return loopj(j, i, k, sum, a);	
		}
		return sum;
	}

}
class Data1
{
	int min;
	int minind;
	Data1(int min,int minind)
	{
		this.min=min;
		this.minind=minind;
	}
}

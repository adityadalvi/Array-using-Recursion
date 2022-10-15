
public class A1H19TRYAVGfind 
{
	static double sum=0;
	static double cnt=0;
	public static void main(String[] args)
	{
		int[][] a= {{1,2,3,4},
				{4,5,6,7},
				{7,5,9,8},
				{4,20,6,7}};
		
		int i=1;
		Data obj=null;
		obj=loopi(i,a,sum,cnt,obj);
		System.out.println(obj.sum);
		System.out.println(obj.sum/obj.cnt);
	}

	private static Data loopi(int i, int[][] a, double sum, double cnt,Data obj) {
		// TODO Auto-generated method stub
		if(i<a.length-1)
		{
			int j=1;
			obj=loopj(i,j,a,sum,cnt,obj);
			i++;
			return loopi(i, a, sum, cnt,obj);
		}
		return obj;
		
	}

	private static Data loopj(int i, int j, int[][] a, double sum2, double cnt2,Data obj) {
		// TODO Auto-generated method stub
		if(j<a[0].length-1)
		{
			sum=sum+a[i][j];
			cnt++;
			obj=new Data(sum,cnt);
			j++;
			return loopj(i, j, a, sum2, cnt2, obj);
		}
		return obj;
		
	}
}
class Data
{
	double sum;
	double cnt;
	Data(double sum,double cnt)
	{
		this.sum=sum;
		this.cnt=cnt;
	}
}


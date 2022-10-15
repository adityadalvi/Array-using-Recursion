
public class A1H26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s1= {'a','b','c','d'};
		char[] s2= {'e','f','g','h','x','y','z'};
		char[] s3=new char[s1.length+s2.length];
		int ind=0;
		int i=0;
		loopi(i,s1,s2,s3,ind);
		int k=0;
		loopk(k,s3);
		

	}

	private static void loopk(int k, char[] s3) {
		// TODO Auto-generated method stub
		if(k<s3.length)
		{
			System.out.print(s3[k]+" ");
			k++;
			loopk(k, s3);
		}
		
	}

	private static void loopi(int i, char[] s1, char[] s2, char[] s3, int ind) {
		// TODO Auto-generated method stub
		if(i<s3.length)
		{
			if(i<s1.length)
			{
				s3[ind++]=s1[i];
			}
			if(i<s2.length)
			{
				s3[ind++]=s2[i];
			}
			i++;
			loopi(i, s1, s2, s3, ind);
		}
		
	}

}

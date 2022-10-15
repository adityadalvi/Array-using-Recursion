
public class A1H24object {

	int id;
	String name;
	int marks;
	A1H24object(int id,String name,int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A1H24object s1=new A1H24object(1,"A",85);
		A1H24object s2=new A1H24object(2,"B",95);
		A1H24object s3=new A1H24object(3,"C",65);
		A1H24object s4=new A1H24object(4,"D",99);
		A1H24object[] a= {s1,s2,s3,s4};
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j =i+1; j < a.length; j++)
			{
				if(a[i].marks>a[j].marks)
				{
					A1H24object temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i].id+" "+a[i].name+" "+a[i].marks);
		}
		
		

	}

}

public class Test{
	public static void Test(int n){
		if(n==1)
		{
			System.out.print("1");
			return ;
		}
if(n%2!=0)
{
System.out.println(n);
}
else
{
System.out.println("#");
}
Test(n-1);
if(n%2!=0)
{	
System.out.println(n);
}
else
{
System.out.println("#");
}
	}
	
	public static void main(String[] args )
	{
		Test(3);
	}
}
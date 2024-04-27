
// aim:- to check whether the number is prime or not 

class A {

	static int flag = 1;

	
	int prime(int n)
	{
	
		for(int i=1;i<=n/2;i++)
		
		{
		
		if(n%2==0)
		{
			flag=0;
			break;
		}
		
	}
	
	return n;
}

	public static void main(String args[])
	
	{
	
		A a = new A();

		System.out.println("n = "+a.prime(3));
		
		if(flag == 1)
		{
			System.out.println("the given number is a prime number");
		}
		else
		{
			System.out.println("the given number is not a prime number");
		}
	}
}
			
		
		
		
		
		
	
	

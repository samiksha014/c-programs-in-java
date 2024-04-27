//aim:- program to print a pyramid pattern 


class pattern {

	int r;                        //number of rows 
	
	pattern(int r)
	{
		this.r=r;
	}
	
	void function()                        //function defining pattern 1
	{	
		System.out.println("Pattern 1");
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}
	
	void function2()                     //function defining pattern 2
	{	
		System.out.println("Pattern 2");
		for(int i=r;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void function3()                   //function defining pattern 3
	{
		System.out.println("Pattern 3");
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=r-i;j++)
			{
				System.out.print(" ");
			}	
				for(int k=1;k<=2*i-1;k++)
				{
					System.out.print("*");
				}
	
			System.out.println();
		}
	}
	
	public static void main (String args[]) throws InterruptedException
	{
		pattern p = new pattern(7);
		
		
		p.function();
		Thread.sleep(1200);
		System.out.println("\n");
		p.function2();
		Thread.sleep(1200);
		System.out.println("\n");
		p.function3();
		
	}
}
			

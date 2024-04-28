//aim:- program to 180 deg rotation of a simple pyramid ;


class pyramid {

	int r;
	
	pyramid(int r){
		this.r=r;
	}
	
	void fun()                   //function defining simple pyramid pattern
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
	
	void pattern(){
		System.out.println("The simple pyramid rotated in 180 deg");
   		 for(int i = r; i >= 1; i--) {
       			 for(int j = 1; j <= r - i; j++) {
          			  System.out.print(" ");
			}
			for(int k = 1; k <= 2 * i - 1; k++) {
        			   System.out.print("*");
       			}
       		 System.out.println();
    		}
	}
	
	
	public static void main(String args[]) throws InterruptedException
	{
		pyramid p = new pyramid(5);
		
		p.fun();
		System.out.println("\n");
		Thread.sleep(1200);
		p.pattern();
}
}
	


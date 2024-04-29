// aim:- program to find common element between two arrays 

class common {
	
	int[] arr1 = {2,6,1,8,10};
	int[] arr2 = {3,2,1,6,9};
	
	void fun()
	{
		System.out.println("The common elements in both the arrays are");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i] == arr2[j])
				{
					System.out.println(" "+arr1[i]);
				}
			}
		}
		
		
	}
	
	public static void main (String args[])
	{
		common c = new common();
		
		c.fun();
	}
}

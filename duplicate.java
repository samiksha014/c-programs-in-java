//aim:- program to copy all the elements of one array to another array;

class copy {

	int[] arr1 = {2,1,8,12,6};
	int[] arr2 = new int[arr1.length];
	
	
	void sample()
	{
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i] = arr1[i];
		
		}
		
		System.out.println("The copy of array 1 in array 2");
		for(int i=0;i<arr1.length;i++)
		{
		
			System.out.println(" "+arr2[i]);
		}
		
	}
	
	public static void main(String args[])
	{
		copy c = new copy();
		c.sample();
	}
}

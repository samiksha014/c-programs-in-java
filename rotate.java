//aim:- program to rotate the element of the array 


class rotate {

	int[] arr1 = {2,8,1,9,10};
	
	void rotate_array()
	{
		System.out.println("Elements of the array before rotation");
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(" "+arr1[i]);
		}
		
		System.out.println();
		System.out.println("Elements of the array after rotation");
		
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.println(" "+arr1[i]);
		}
		
	}
	
	public static void main(String args[])
	{
		rotate r = new rotate();
		r.rotate_array();
	}
}

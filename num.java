//aim:- to find maximum and minimum element in an array 


class max_min {
	
	int arr[] = {4,3,8,1};
	int max=arr[0];
	int min=arr[0];
	
	void fun()
	{
		
		for(int i=1;i<4;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			if(arr[i]<min)
			{	
				min=arr[i];
			}
		}
		System.out.println("The maximum element of the array :- "+max);
		System.out.println("The minimum element of the array :- "+min);
		
		
	}
	
	public static void main(String args[])
	{
		max_min m = new max_min();
		m.fun();
	}
}

	

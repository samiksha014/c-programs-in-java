//aim:- program to sort the 2D arrays across rows 

class sort {

	int[][] arr1 = {{4,8,2,1},{12,9,7,5}};
	
	void sort_array()
	{
		System.out.println("array before sorting the elements across rows");
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(" "+arr1[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("array after sorting the elements across the rows");
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=arr1[i].length-1;j>=0;j--)
			{
				System.out.print(" "+arr1[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public static void main(String args[])
	{
		sort s = new sort();
		s.sort_array();
	}
}

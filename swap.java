//aim:- program to swap two numbers


class swap {

	static int a;
	static int b;
	static int temp;

	swap(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
	public static void main(String args[])
	{
		swap s = new swap(12,6);
		
		System.out.println("The value of a before swap :- "+a);
		System.out.println("The value of b before swap :- "+b);
		
		temp = a;
		a=b;
		b=temp;
		
		System.out.println("The value of a after swap :- "+a);
		System.out.println("The value of b after swap :- "+b);
		
		
	}
}

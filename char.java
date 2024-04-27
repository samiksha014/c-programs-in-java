//aim:- program to check wether the character is vowel or consonant 


class Character {

	//vowel:- a,e,i,o,u;
	//consonant:- letters other than vowels;
	
	char c;
	
	Character(char c)
	{
		this.c=c;
	}
	
	void fun()
	{
		 char[] vowel = {'a','e','i','o','u'};
		 
		 System.out.println("Character = "+c);
	
		for(int i=0;i<vowel.length;i++)
		{
			if(c == vowel[i])
			{
				System.out.println("the given character is vowel");
				break;
				
			}
			
			else{
				System.out.println("the given character is consonant");
				break;
			}
			
			
		}
	}
	
		
	
	public static void main (String args[])
	{
		Character ch = new Character('b');
		
		ch.fun();
			
	}
}

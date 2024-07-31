package Looping;

public class Palindrome {

	public static void main(String[] args)
	{
		
		int no = 12321;
		int no1 = no ;
		int reverse =0; 

		while(no>0)
		{
		  reverse = (reverse*10) + no%10; //19
		no = no/10; //cake = 458
		}
		System.out.println(reverse);
	
	if(no1 == reverse)
		  System.out.println("Palindrome");
		else
		  System.out.println("Not Palindrome");
	 }
}
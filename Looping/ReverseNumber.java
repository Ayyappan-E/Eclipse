package Looping;

public class ReverseNumber {


	public static void main(String[] args)
	{
		
		 int no = 456789;
	        
	        while (no > 0) {
	            int reverse = no % 100; // Get the last two digits
	            System.out.print(reverse);
	            no /= 100; // Remove the last two digits from 'no'
	        }
}
}
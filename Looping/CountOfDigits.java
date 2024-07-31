package Looping;

public class CountOfDigits {
	public static void main(String[] args)
	{
		
		int no1 = 0;
		int no2 = 1;

		while(no1<15) {  
			  System.out.print(" "+no1);    
			  no2=no1+no2;    
			  no1=no2 - no1;  
		
		}
	}
	}




//0 1 1 2 3 5
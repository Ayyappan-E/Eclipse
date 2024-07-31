package Looping;

public class PatternW {
	public static void main(String[] args) {
	for(int row=1;row<=9;row++) 
	{
		for(int col=1;col<=9;col++) 
		{
			if(col==1 || col==9 || col==row && row>4 || col+row==9+1 && col<5)
				
			System.out.print("W ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
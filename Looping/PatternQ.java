package Looping;

public class PatternQ {
	
	public static void main(String[] args) {

	for(int row=1;row<=15;row++) 
	{
		for(int col=1;col<=15;col++) 
		{
			if(row==1 && col!=1 && col<9 ||
			   col==1 && row!=1 && row<9 || 
			   col==9 && row!=1 && row<9 || 
			   row==9 && col!=1 && col<9 || col==row && row>6 && row<12)
				
			System.out.print("Q ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}

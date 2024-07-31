package Looping;

public class PatternY {
	public static void main(String[] args) {
	for(int row=1;row<=9;row++) 
	{
		for(int col=1;col<=9*5;col++) 
		{
			if(col==row && row<5 || col==5 && row>4 || row+col==9+1 && col>5)
				
			System.out.print("X ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
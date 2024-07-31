package Looping;

public class PatternV {
	public static void main(String[] args) {
	for(int row=1;row<=5;row++) 
	{
		for(int col=1;col<=10;col++) 
		{
//			if(col==1 && row<7 ||
//			   col==5 && row<7 || 
//			   row==7 && col!=1 && col!=3 && col!=5 ||
//			   col==3 && row>7)
			
			if(row==col || col+row==10)
				
			System.out.print("V ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}
}
package Looping;

public class PatternS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				if(row==1 &&col!=1 ||
				   col==1 && row<=4 &row!=1 || 
				   row==5 && col!=1 && col!=9  ||
				   col==9 && row>5 && row!=9 ||
				   row==9 && col!=9 )
				System.out.print("S ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}


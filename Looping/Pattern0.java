package Looping;

public class Pattern0 {
	public static void main(String[] args) {
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				if(col==1 && row!=1 && row!=9 ||
				   col==9 && row!=1 && row!=9 ||
				   row==1 && col!=1 && col!=9 ||
				   row==9 && col!=1 && col!=9 ||
				   col==row && col!=1 && col!=9)
					
				System.out.print("0 ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}

}
}

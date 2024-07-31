package Looping;

public class Pattern9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 	for(int row=1;row<=9;row++) 
			{
				for(int col=1;col<=7;col++) 
				{
					if(col==7 && row!=1 && row!=9 ||
					   row==1 && col!=1 && col!=7 ||
					   row==5 && col!=1 && col!=7 ||
					   row==9  && col!=7 ||
					   col==1 && row!=5 && row!=1 && row<6)						
					System.out.print("9 ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
}
}
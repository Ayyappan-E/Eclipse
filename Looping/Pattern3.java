package Looping;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			for(int row=1;row<=9;row++) 
			{
				for(int col=1;col<=6;col++) 
				{
					if(col==6 && row!=1 && row!=5 && row!=9 ||
					   row==1 && col!=6 ||
					   row==5 && col!=6 && col!=1 ||
				       row==9 && col!=6)						
					System.out.print("3 ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
		}
}

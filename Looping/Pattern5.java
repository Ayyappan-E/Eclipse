package Looping;

public class Pattern5 {

	public static void main(String[] args) {

		for(int row=1;row<=7;row++) 
		{
			for(int col=1;col<=7;col++) 
			{
				if(row==1 || row==4 || row==7 ||
							  col==1 && row<5 ||
							  col==7 && row>4)
					
				System.out.print("5 ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

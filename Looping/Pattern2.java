package Looping;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			for(int row=1;row<=9;row++) 
			{
				for(int col=1;col<=9;col++) 
				{
					if(row==1 | row==5 || row==9 ||
							      col==9 & row<6 || 
							      col==1 && row>4)						
					System.out.print("2 ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
		}
}

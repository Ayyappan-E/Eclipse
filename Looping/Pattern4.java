package Looping;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1;row<=9;row++) 
			{
				for(int col=1;col<=9;col++) 
				{
					if(col==5 || row==5 || row+col==6 )
						
					System.out.print("4 ");
					else 
						System.out.print("  ");
				}
				System.out.println();
			}
		}
}

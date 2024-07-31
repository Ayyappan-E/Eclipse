package Looping;

public class Pattern6 {
	public static void main(String[] args) {

		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				 if(row==1 && col!=1 && col!=9||
					row==5 && col!=9 || 
					row==9 && col!=1 && col!=9|| 
				    col==1 && row!=9 && row!=1|| 
				    col==9 && row>5 && row!=9)					
				System.out.print("6 ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}

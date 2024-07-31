package Looping;

public class PatternO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) 
		{
			for(int col=1;col<=7;col++) 
			{
				if(row==1 && col!=1 && col!=7|| 
						    row==7 && col!=7 && col!=1||
							 col == 1 && row!=1 && row!=7 ||  
							 col==7 && row!=1 && row!=7 )
				System.out.print("O ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

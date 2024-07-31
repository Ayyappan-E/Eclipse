package Looping;

public class PatternI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1;row<=7;row++) 
		{
			for(int col=1;col<=7;col++) 
			{
				if(row==1 || row==7 || col==4)
				System.out.print("I ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}

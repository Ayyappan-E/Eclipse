package Looping;

public class PatternX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				if(row==col || row+col==9+1)
				System.out.print("X ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}


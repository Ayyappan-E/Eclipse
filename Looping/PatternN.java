package Looping;

public class PatternN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
			if(col==row ||col==9||col==1)
				System.out.print("N ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

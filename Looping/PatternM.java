package Looping;

public class PatternM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
			if(col==row && col<=4 ||row+col==9+1 && row<6 ||col==9 ||col==1)
				
				System.out.print("M ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

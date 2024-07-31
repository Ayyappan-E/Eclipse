package Looping;

public class PatternG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) 
		{
			for(int col=1;col<=7;col++) 
			{
				if(row==1 || row ==7 || col==1 || col==7 && row!=2 & row!=3 || row==4 && col!=2 && col!=3)
				System.out.print("G ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

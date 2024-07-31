package Looping;

public class PatternT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				if(row==1 || col==5)
				System.out.print("T ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

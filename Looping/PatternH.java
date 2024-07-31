package Looping;

public class PatternH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				if(col==1 || col==9 || row==5)
				System.out.print("H ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

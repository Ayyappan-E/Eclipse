package Looping;

public class PatternL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=7;row++) 
		{
			for(int col=1;col<=7;col++) 
			{
				if(row==7 || col==1) 
				System.out.print("L ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

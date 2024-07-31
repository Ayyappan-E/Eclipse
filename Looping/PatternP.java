package Looping;

public class PatternP {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				if(col==1 || row==1 && col<=4 || row ==5 && col<=4 || col==5 && row>1 &&row<5  )
				System.out.print("P ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}


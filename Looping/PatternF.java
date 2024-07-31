package Looping;

public class PatternF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=9;row++) 
		{
			for(int col=1;col<=9;col++) 
			{
				if(row==1 && col!=9 && col!=8|| col==1 || row==4 && col!=9 && col!=8)
				System.out.print("F ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}

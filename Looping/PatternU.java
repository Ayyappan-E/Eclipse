package Looping;

public class PatternU {
	
public static void main(String[] args) {
	// TODO Auto-generated method stub
	for(int row=1;row<=9;row++) 
	{
		for(int col=1;col<=9;col++) 
		{
			if(col==1 && row<=8 || col==9 && row<=8 || row==9 && col!=9 && col!=1)
			System.out.print("U ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}

}

package Looping;

public class Pattern1 {
	
	public static void main(String[] args) {

	for(int row=1;row<=9;row++) 
	{
		for(int col=1;col<=9;col++) 
		{
			if(col==5 || row+col==6  || row==9)
				
			System.out.print("1 ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}

}

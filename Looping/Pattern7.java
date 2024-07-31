package Looping;

public class Pattern7 {

	public static void main(String[] args) {
	for(int row=1;row<=7;row++) 
	{
		for(int col=1;col<=7;col++) 
		{
			if(row==1 || row+col==7+1  )
				
			System.out.print("7 ");
			else 
				System.out.print("  ");
		}
		System.out.println();
	}
}

}


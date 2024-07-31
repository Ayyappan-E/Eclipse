package Looping;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5; row++)
	    {
		    for(int col = 1; col<row ; col++)
		        {
		        System.out.print("  ");
		        }
		    for(int col = 1; col<=6-row ; col++)
		    {
		      System.out.print(row+1.1+" ");
		    }
		    System.out.println();
		 }
	   
	}

}

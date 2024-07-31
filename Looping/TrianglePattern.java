package Looping;

public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1; row<=5; row++)
	    {
	    for(int col=1; col<=row; col++)
	        System.out.print("* ");//row row+col 
	    for(int col=1;col<=5-row;col++)
	    	System.out.print(" 1  ");
	    for(int col=1; col<=row; col++)
	      System.out.print("* ");
	    
	    System.out.println();
		//int no = 1; 
//	    for(int row=1; row<=5; row++)
//	        {
//	        for(int col=1; col<= row; col++)
//	            {
//	            System.out.print(col+row+" ");
//	          //  no++;
//	            }
//	        System.out.println();
	        	    }
	}
}

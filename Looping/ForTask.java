package Looping;

public class ForTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row = 1; row<=5; row++) // Row controller 
	    {
		    for(int col =1; col<=row ; col++)
		        {
		    	if (col==1)
		        System.out.print(row+0+ " ");
		        
		        if (col==2)
			        System.out.print(row+4+" ");
		        
		        if (col==3)
			        System.out.print(row+7+" ");
		        
		        if (col==4)
			        System.out.print(row+9 +" ");
		        
		        if (col==5)
			        System.out.print(row+10 +" ");
		         }
		   		   
		    System.out.println();
		 }
	   
	}

}

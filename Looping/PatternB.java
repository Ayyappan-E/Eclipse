package Looping;

public class PatternB {

	public static void main(String[] args) {
		 for(int line=1;line<=18;line++)
	        {
	            for(int star=1;star<=9;star++)
	            {
	            	 if(star ==1 || 
	            	   (star == 9 && line != 1 && line != 9 && line != 18 && line > 1) ||
	            	   (line==1 && star < 9) ||
	            	   (line==9 && star < 9)||
	            	   (line ==18 && star!=9))
	                		 System.out.print("* ");
	            	 
//	            	 else if(line>1 && line<9)
//	            		 System.out.print("$ "); 
	                else
	               
	                System.out.print("  ");
	               
	            }
	            System.out.println();
			
			}
}
}

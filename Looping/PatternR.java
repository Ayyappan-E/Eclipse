package Looping;

public class PatternR {

	public static void main(String[] args) {
		 for(int line=1;line<=18;line++)
	        {
	            for(int star=1;star<=9;star++)
	            {
	            	 if(star ==1 || (star == 9 && line != 1 && line != 9) || 
	            			 (line==1 && star < 9) || (line==9 && star < 9))
	                		 System.out.print("R ");
	            	 
	                else
	               
	                System.out.print("  ");
	               
	            }
	            System.out.println();
			
			}
}
}

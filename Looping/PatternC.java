package Looping;

public class PatternC {

	public static void main(String[] args) {
		 for(int line=1;line<=7;line++)
	        {
	            for(int star=1;star<=7;star++)
	            {
					if(line==1 && star!=1 || line==7 && star!=1 || star==1 && line!=7 &&line!=1)
	                		 System.out.print("C ");
					
	                  else
	               
	                System.out.print("  ");
	               
	            }
	            System.out.println();
			
			}
}
}

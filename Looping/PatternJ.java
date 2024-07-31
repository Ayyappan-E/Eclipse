package Looping;

public class PatternJ {

	public static void main(String[] args) {
		  for (int line = 1; line <= 9; line++) {
	            // Loop through each position in the line
	            for (int star = 1; star <= 9; star++) {
	                // Print a star for the vertical line in the middle,
	                // or for the bottom horizontal line.
	                if (line==1 || star == 5 || (line == 9 && star <= 5) || (line >= 5 && star == 1 && line <= 8)) {
		        //  if (star==5&& line==1 || line>=4) {

	                	System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            // Move to the next line after the inner loop completes
	            System.out.println();
			
			}
}
}

package Looping;

public class PatternK {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	for(int line = 1; line<=9; line++)
    {
        for(int star = 1; star<=9;star++)
        {
        if(star==1 || (line+star==6 && line<=5) || 
                (line-star==4 && line>5))
        {
          System.out.print("* ");
        }
        else
          System.out.print("  ");
        }
        System.out.println();
    }
}
}
package Looping;

public class PatternA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 for(int row=1;row<=7;row++)
	        {
	            for(int col=1;col<=7;col++)
	            {
	           
//	            	if(col==4 && row==1 ||
//	            			row==2 && col!= 1 && col!=2 && col!=4 && col!=6 && col!=7 ||
//	            			row==3 && col!= 1 && col!=3 && col!=4&& col!=5 && col!=7  ||
//	            			row==4  && col!=2 && col!=3 && col!=4&& col!=5 && col!=6  ||
//	            			col==1 && row!=1 && row!=2 && row!=3 && row!=4 ||
//	            			col==7 && row!=1 && row!=2 && row!=3 && row!=4 ||
//	            			row==4 && col!=1 && col!=7)
	            	if(row+col==4+1 || col-row==3 ||row==4||col==1 && row>=5 || col==7 && row>=5)
	              	System.out.print("A ");
	            	 
//	            	 else if(line>1 && line<9)
//	            		 System.out.print("$ "); 
	                else
	               
	                System.out.print("  ");
	               
	            }
	            System.out.println();
			
			}
}
}

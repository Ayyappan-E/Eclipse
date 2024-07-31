package Looping;

public class MyNamePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int row=1;row<=5;row++) 
		{
			for(int col=1;col<=41;col++) 
			{
//			
				
				if(col==1|| col==4 || row==1 && col<5 || row==3 && col<5 ||                                    //A
				   col==6&& row<4 || col==9 || row==5 && col>=6 && col<=9 ||  row==3 && col>=6 && col<=9 ||    //Y
				   col==11&& row<4 || col==14 || row==3 && col>10 && col<14 || row==5 && col>=11 && col<14 ||  //Y
				   col==16 || col==19 ||row==1 && col>16 && col<19 || row==3 && col>16 && col<19 ||            //A
				   col==21 || col==24 & row<4 || row==1 && col>21 && col<24 || row==3 && col>21 && col<24 ||   //P
				   col== 26 || col==29 & row<4 || row==1 && col>26 && col<30 || row==3 && col>26 && col<30 ||  //P
				   col==31 || col==34 ||row==1 && col>31 && col<34 || row==3 && col>31 && col<34 ||		       //A
				   col== 36 || col==40 || col==37 && row>1 && row<3 || col==38 && row>2 && row<4 ||col==39 && row>3 && row<5) //N
					
				System.out.print("@ ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
}
}

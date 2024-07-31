package Looping;

public class Ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1234;
	    System.out.println(ascending(num)?"ascending":"not ascending");
	}
				public static boolean ascending(int num)
				  {
				    while(num!=0)
				    {
				      int temp1=num%10;
				      num/=10;
				      int temp2=num%10;
				      
				      if(temp1>=temp2)
				        continue;
				      else
				        return false;
				    }
				    return true;
				  }

	
				
	}


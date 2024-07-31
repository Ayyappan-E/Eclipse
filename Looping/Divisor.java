package Looping;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=100;
		System.out.println(no);
		int divisor = 1;
	while((divisor<no && no%divisor==no)) {
		System.out.println(divisor);
		//divisor++;
		no--;
	}
	}

}

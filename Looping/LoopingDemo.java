package Looping;

import java.util.Scanner;

class LoopingDemo{

public static void main(String[] Args) {
  System.out.println("Enter your marks ");
  	int[] marks = new int[5];
  	Scanner sc = new Scanner(System.in);

int count = 1; 
int total = 0;
for(int i = 0;   i<marks.length; i++)
  {
//  String no;
System.out.println("Enter Mark "+count +" : ");
count++;
  marks[i] = sc.nextInt();
  //total = total + marks[i];
  total+=marks[i];
  
  }
System.out.println(total);
System.out.println("persentage :"+total/marks.length+" %");
}
}
package Looping;

public class SquareInsideDiomond {

    public static void main(String[] args) {
      
        for(int row=1;row<=5;row++) {
            
            for(int col=5; col>=row;col--) {
              
            System.out.print(" 0 ");
            }
            for(int col=1;col<=row;col++)
              System.out.print(" * ");
            
            for(int col=2;col<=row;col++)
              System.out.print(" * ");
            
            for(int col =5;col>=row;col--)
            System.out.print(" 0 ");
            
            
            System.out.println();
            
          }
        for(int col=1; col<=11; col++) {
          System.out.print(" * ");
        }
        System.out.println();
          //System.out.println("  1   1   1   1   1   1   1   1   1   1   1");
           for(int row=1;row<=5;row++) {
            
            for(int col=1; col<=row;col++) 
              
            System.out.print(" 0 ");
            
            for(int col=5;col>=row+1;col--)
              System.out.print(" * ");
            
            for(int col=5; col>=row;col--) 
              
              System.out.print(" * ");
            
            for(int col=1;col<=row;col++)
              System.out.print(" 0 ");
            
            
            
            System.out.println();

      }
        }

      }
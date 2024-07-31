package Looping;

public class PatternNumReverse {
  public static void main(String[] args)
  {
    for(int row=1;row<=5;row++) {
      for(int col=5;col>=1; ) {
      System.out.print(col-row);
      col++;
    }
    System.out.println();
  }

}
}
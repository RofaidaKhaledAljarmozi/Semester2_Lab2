import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
  //  2. Write a Java method that Clone an array to a backup array.
    public static void Clone(int array[],int size)
    {
      int brray[]=new int[5];
      Scanner in=new Scanner(System.in);
      System.out.println("please enter 5 elements of an array to clone them in another array");
      for (int i = 0; i < array.length ; i++) {
        array[i]=in.nextInt();
        for (int j = 0; j < brray.length; j++) {
          brray[j]=array[i];
        }
      }
    }

  public static void main(String[] args) {
    int x[]=new int[5];
    for (int i = 0; i < x.length; i++) {

    }
Clone(x,5);

    System.out.println("CloneElements"+Arrays.toString(x));
  }
}

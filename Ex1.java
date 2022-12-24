import java.util.Arrays;
import java.util.Scanner;

public class Ex1 {
    //1. Write a Java method that Reverse an array using another array.
    public static void revers(int a[],int size)
    {
        Scanner in=new Scanner(System.in);

        int b[]=new int[5];
        for (int i = 5-1; i >=0; i--) {
            a[i]=in.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]==a[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("please enter 5 elements to revers them");
        int x[]=new int[5];
        revers(x,5);
        System.out.println(Arrays.toString(x));

    }
}

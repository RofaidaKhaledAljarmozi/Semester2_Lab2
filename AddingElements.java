import java.util.Arrays;
import java.util.Scanner;

public class AddingElements {
    static int numofelwmwnt = 0;

   public static boolean input(int a[], int Nelement) {
if (numofelwmwnt< a.length)
{
   a[numofelwmwnt]=Nelement;
   numofelwmwnt++;
return true;
}
return false;
   }

   public static void main(String[] args) {

      int v[]=new int[5];
              Scanner in =new Scanner(System.in);
      System.out.println(Arrays.toString(v));

      //6علشان نعرف عدد مرات الفشل
      for (int i = 0; i < 6 ;i++) {
      if (input(v,in.nextInt()))
         System.out.println(Arrays.toString(v));
else System.out.println("Array is full");
   }}
}

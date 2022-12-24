import java.util.Arrays;

public class ShiftLeft {
  //shift
  public static void shift(int a[])
  {
      for (int i = 0; i < a.length-1; i++) {
          a[i]=a[i+1];
      }
      a[a.length-1]=Integer.MIN_VALUE;

  }

    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(x));
        shift(x);
        System.out.println(Arrays.toString(x));
        shift(x);
        System.out.println(Arrays.toString(x));

    }

}

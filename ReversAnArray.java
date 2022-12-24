import java.util.Arrays;

public class ReversAnArray {
    public  static void reserve(int a[])
    {
        int n= a.length-1;
        for (int i = 0; i < a.length/2; i++) {
            int t=a[i];
            a[i]=a[n];
            a[n]=t;
            n--;

        }
    }

    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(x));
        reserve(x);
        System.out.println(Arrays.toString(x));


    }
}

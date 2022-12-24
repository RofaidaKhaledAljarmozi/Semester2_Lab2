import java.util.Arrays;

public class ShiftRight {
    public static void right(int a[])
    {
        for (int i =a.length-1; i>0; i--) {
            a[i]=a[i-1];
        }
        a[0]=Integer.MIN_VALUE;

    }
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(x));
        right(x);
        System.out.println(Arrays.toString(x));
}}

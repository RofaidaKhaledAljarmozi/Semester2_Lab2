import java.util.Arrays;

public class RotateLift {
    public static void rotateLift(int a[])
    {
        int t=a[0];

        for (int i =0; i<a.length-1;i++) {
            a[i]=a[i+1];
        }
        a[a.length-1]=t;

    }
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(x));
        rotateLift(x);
        System.out.println(Arrays.toString(x));
    }}



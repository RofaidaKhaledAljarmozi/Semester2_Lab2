import java.util.Arrays;

public class RotateRight {
    //rotate
    public static void rotateRight(int a[])
    {
        int t=a[a.length-1];

        for (int i =a.length-1; i>0; i--) {
            a[i]=a[i-1];
        }
        a[0]=t;

    }
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6};
        System.out.println(Arrays.toString(x));
        rotateRight(x);
        System.out.println(Arrays.toString(x));
    }}


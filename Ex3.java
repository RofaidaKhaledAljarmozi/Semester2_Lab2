import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex3 {
//    3. Write a Java method that repeatedly selects and removes a random
//    entry from an array until the array holds no more entries
public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
    removeElements(array);
}

    static void removeElements(int[] array) {
        Random r = new Random();
        while (array.length > 0) {
            int index = r.nextInt(array.length);
            System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
            int[] array1 = new int[array.length - 1];
            for (int i = 0; i < index; i++)
                array1[i] = array[i];
            for (int i = index; i < array.length - 1; i++)
                array1[i] = array[i + 1];
            array = array1;
        }
    }
}



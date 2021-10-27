package lesson17;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] Array = {3, 6, 8, 5, 67, 98, 23, 45, 78, 65};
        int tmp=Array[0];
        Array[0]=Array[1];
        Array[1]=tmp;
//   կլյուչավոր բառեր են
        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));
    }

        }

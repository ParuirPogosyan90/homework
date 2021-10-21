package lesson16;

import java.util.Arrays;

public class JavaArraySort {
    public static void main(String[] args) {
        int[] Array={3,6,8,5,67,98,23,45,78,65};
        String[]strArr={"E","A","S","O","W","Q","I","P","T","F"};
        Arrays.sort( Array);
        Arrays.sort(strArr);
        System.out.println(Arrays.toString( Array));
        System.out.println(Arrays.toString(strArr));
    }
}

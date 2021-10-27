package lesson15;

//ստուգում ենք կամ տռուն կամ ֆոլսը
public class ArreyExample3 {
    public static void main(String[] args) {
        int[] array = {3, 6, 7, 9, 2, 6, 13, 4, 5, 3};
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result = false;
                break;
            }
        }
        System.out.println(result);

    }
}

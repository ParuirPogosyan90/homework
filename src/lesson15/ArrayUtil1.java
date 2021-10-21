package lesson15;

public class ArrayUtil1 {

    static int size = 0;
    static char c = 'o';
    static char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

    public static void main(String[] args) {

        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                size++;
            }

        }
        System.out.println(size);
    }

    }








package lesson6;

public class ArrayExample {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        System.out.println(numbers[4]);
        numbers[0] = 45;
        numbers[2] = 450;
        numbers[3] = 4500;
        System.out.println(numbers[0]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
}

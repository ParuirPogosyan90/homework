package lesson9;
//ստանում ենք այս պատկերը
//         x
//        xx
//        xxx
//        xxxx
//        xxxxx
public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}

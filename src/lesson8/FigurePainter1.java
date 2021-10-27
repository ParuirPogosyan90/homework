package lesson8;
//ստանում ենք այս պատկերը
//x x x x x
//x x x x
//x x x
//x x
//x

public class FigurePainter1 {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            for (int j = 5; j > i; j--) {

                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

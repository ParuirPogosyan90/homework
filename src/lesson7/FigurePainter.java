package lesson7;

public class FigurePainter {

    public static void main(String[] args) {
//ստանում ենք այս պատկերը
        /*
         *
         *  *
         *  * *
         *  * * *
         *  * * * *
         *  * * * * *
         */
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j<= i; j++) {

                System.out.print("* ");

            }
            System.out.println();
        }


    }
}

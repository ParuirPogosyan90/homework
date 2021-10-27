package lesson15;
//ստուգում ենք  կրկնվող մասիվի ինդեքսները
public class ArreyExampl2 {
    public static void main(String[] args) {
        int[]array={3,6,7,9,2,6,13,4,5,3};
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]==array[j]){
                    System.out.println(array[i]+"-повторится");
                    break;
            }
             }


        }
            
        }



    }


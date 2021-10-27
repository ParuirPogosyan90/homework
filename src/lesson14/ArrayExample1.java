package lesson14;
//եթե n ի արժեքի  թիվը չկա  ապա տպում է -մեկ  եթե կա տպում է այդ թվի ինդեքսը
public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arrey = {2, 5, 7, 6, 9, 24, 56, 78, 98, 11};
        int n = 76;
        int indeks=-1;
        for (int i = 0; i < arrey.length; i++) {
            if (arrey[i] == n) {
                indeks=i;
                System.out.println(i);
            }
        }
        System.out.println(indeks);

    }
}


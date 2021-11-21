package lesson3;

public class ABDemo {
    public static void main(String[] args) {
//Սուպեր A  ին տալիս ենք superob  կանստրուկտրը
        A superob=new A();
//подкласс в ին տալիս ենք subob կանստրուկտորը
        B subob=new B();
//super i ին տալիս ենք արժեք
        superob. i=10;
//super j-ին տալիս ենք արժեք
        superob.j=20;
//տպում ենք super ի i և j
        System.out.println("i,j, superob:");
//superod_ը ցույց է տալիս արժեքները
        superob.showij();
//նոր տողի համար
        System.out.println();
//արժեք ենք տալիս subob i-ին
        subob.i=7;
//արժեք ենք տալիս j
        subob.j=8;
//արժեք ենք տալիս k
        subob.k=9;
//տպում ենք subob  ի ,i,j,k,
        System.out.println("i,j,k,subob:");
//ցույց է տալիս արժեքները
        subob.showij();
        subob.showk();
//նոր տողիհամար
        System.out.println();
//տպում ենք ընդհանուր արժեքը
        System.out.println("sum i,j,k subob:");
        subob.sum();
    }
}


package lesson3;
//կլասս Բ ժառանգում է կլաս Ա  ից․դա հենց  extends բառն է,
public class B extends A {
//int դա Բ ի գլոբոլ փոփոխականն է
    int k;
//void show սա նշանակում է Չվերադարձնող,առանձ արժեք թիվ որը ցույց է տալիս k
    void showk() {
        System.out.println("k;"+k);
        }
//Sum  նշանակում է ընդհանուր քանակ
    void sum(){
        System.out.println("i+j+k:"+(i+j+k));
    }
}
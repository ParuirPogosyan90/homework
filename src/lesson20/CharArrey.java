package lesson20;

public class CharArrey {
    public static void main(String[] args) {
//համարակալում ենք ինդեքս  0   1  2   3   4   5
        char[]chararrey={'b','o','l','o','l','a'};
//առաջին ինդեքս գտնելու համար․օգտագործում ենք
        System.out.print(chararrey[0]);
//նոր տողի համար օգտագործում ենք
        System.out.println();
//վերջին ինդեքս գտնելու համար․օգտագործում ենք
        System.out.print(chararrey[chararrey.length-1]);
//նոր տողի համար օգտագործում ենք
        System.out.println();
//նախավերջին ինդեքսի   համար օգտագործում ենք
        System.out.println(chararrey[chararrey.length-2]);
// նոր տողի համար օգտագործում ենք
        System.out.println();
//մեջտեղի ինդեքսի   համար օգտագործում ենք
        System.out.println(chararrey[chararrey.length/2]);
// նոր տողի համար օգտագործում ենք
        System.out.println();
// դնել փոփոխական
int caunt=0;
 //գտնել քանի օ կա մեր մասիվում
 char  c='o';
        for (int i = 0; i < chararrey.length; i++) {
            if (chararrey[i]==c){
                caunt++;
            }
        }
//լուծման համար
        System.out.print("caunt of'"+c+"'="+caunt);
        System.out.println();
//եթե մասիվը վերջանում է l,j,ով ապա պիտի տպի տռու եթե ոչ ապա ֆոլս
// գտնում ենք մասիվի առաջին էլեմենտը
if (chararrey[chararrey.length-2]=='l'&&
 // գտնում ենք մասիվի վերջին էլեմենտը
                chararrey[chararrey.length-1]=='y'){
//եթե ճիշտ է ապա տպի տռու
            System.out.println(true);
//կամ
        }else{
//եթե սխալ է տպի ֆոլս
            System.out.println(false);
//եթե մասիվում կա բոբ բառը տպել
//քանի որ սրա համար մեզ պետք է լոգիչսկի լուծում ապա պետք է բուլյանը,isBob դա փոփոխական է
    boolean isBob=false;
    for (int i = 0; i < chararrey.length; i++) {
//պայմանի ի դա պարտադիր է իսկ ի գումարած երկու  դա բ տառից հետո ի թվի  գտնելու համար է
        if (chararrey[i]=='b'&& chararrey[i+2]=='b'){
//եթե այո է տպում է տռու
isBob=true;

        }
        
    }
    System.out.println(isBob);
//պրոբելներով ստանալ հելլո ջավա բառը
char[]text={' ',' ','H','E','L','L','0',' ','J','A','V','A',' ',' ',' '};
//պետք է հաշվել սկզբի ու վերջին ինդեքսները
    int startindeqs=0;//սկզբի ինդեքս
    int endindeqs=text.length-1;// վերջին ինդեքս -մեկը նշանակու է որ հաշվել վերջին ինդեքսից
//ֆորով ստուգում ենք
    for (int i = startindeqs; i <=endindeqs ; i++) {
        System.out.print(text[i]);
        
    }    
        }


    }
}

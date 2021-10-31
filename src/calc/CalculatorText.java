package calc;

public class CalculatorText {
//սա տպելու համար է
    public static void main(String[] args) {
//տալիս ենք նոր արժեք
        Calculator calculator=new Calculator();
//օգտագործում ենք փոփոխականը
        int result=calculator.plus(5,9);
//    տպում ենք
        System.out.println(result);
int resuit=calculator.minus(60,35);
        System.out.println(resuit);
//բաժանման կամ բազմապատկման ժամանակ օգտագործվում են long կամ double ամբողջ թվերը
long l=calculator.divide(60,2);
        System.out.println(l);
double d=calculator.multiple(7,2);
        System.out.println(d);

    }

    }



package lesson1;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox=new Box();
        double vol;
        myBox.width=19;
        myBox.depth=15;
        myBox.height=20;
        vol= myBox.depth * myBox.height * myBox.width;
        System.out.println("vol"+vol);
    }
}

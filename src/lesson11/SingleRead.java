package lesson11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class SingleRead implements Runnable {
    String keyword;
    List<String> strings;
    public static AtomicInteger countOfKeyword = new AtomicInteger();
    Thread t;

    SingleRead(String keyword, List<String> strings) {
        this.keyword = keyword;
        this.strings = strings;
        t = new Thread(this);
        t.start();

    }


    @Override
    public void run() {
        for (String string : strings) {
            if (string.contains(keyword)) {
                countOfKeyword.incrementAndGet();
            }
        }
    }


    public static void main(String[] args) throws IOException {


        String path = "C:\\Users\\parui\\Desktop\\aaa\\text.txt";
        int count = (int) Files.lines(Paths.get(path)).count();
        String keyword = ";";
        System.out.println("all lines:" + count);


        List<String> strings = Files.readAllLines(Paths.get(path));

        List<String> subString1 = strings.subList(1, count / 3);
        List<String> subString2 = strings.subList((count / 3) + 1, 2 * (count / 3));
        List<String> subString3 = strings.subList((2 * (count / 3)) + 1, count);

        long currentTime = System.currentTimeMillis();
        try {
            new SingleRead(keyword, subString1).t.join();
            new SingleRead(keyword, subString2).t.join();
            new SingleRead(keyword, subString3).t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));
    }


}




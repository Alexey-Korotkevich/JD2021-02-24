package by.it.levchuk.levchuk.jd02_02;

/*crash-noobik
Liauchuk Aliaksandr*/

import java.util.ArrayDeque;
import java.util.Queue;

public class Store {

    public static void main(String[] args) {
        System.out.println("МАГАЗИН ОТКРЫЛСЯ");
        int numberBuyer = 0;
        Queue<Buyer> queue = new ArrayDeque<>();
        for (int time = 0; time < Сoefficients.VISIT_TIME; time++) {
            int count = Tools.getRandom();
            for (int i = 0; i < count; i++) {
                Buyer buyer = new Buyer(++numberBuyer);
                queue.add(buyer);
                buyer.start();
            }
            Tools.sleep(1000);
        }
        for (Buyer buyer : queue) {
            try {
                buyer.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("МАГАЗИН ЗАКРЫЛСЯ");
    }
}

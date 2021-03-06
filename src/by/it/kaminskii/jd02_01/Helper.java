package by.it.kaminskii.jd02_01;/* created by Kaminskii Ivan
 */

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Helper {

    static int randomValue(int min, int max) {

        return ThreadLocalRandom
                .current()
                .nextInt(max - min + 1);
//        Random random = new Random();
//        return random.nextInt(max - min + 1) - min;
    }

    static int randomValue(int max) {
        return randomValue(0, max);
    }

    static void sleep(int sleepTime) {
        try {
            Thread.sleep(sleepTime / 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

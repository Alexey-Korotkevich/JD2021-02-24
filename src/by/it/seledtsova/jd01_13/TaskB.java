package by.it.seledtsova.jd01_13;
/*
В классе TaskBнапишите цикл, который:
+считывает данные из консоли построчнои закрывается при вводе в консоль слова END;
+переводит каждую строку в вещественное числои выводит в консоль данное число и корень из суммы всех ранее введенных чисел, включая введенное;
если перевести ввод в число невозможно, то программа перехватывает полученную ошибку и показывает сообщение в консоли сообщение, такого же формата, как в предыдущем задании
если невозможно извлечь корень, то обработка аналогична, но тип ошибки -ArithmeticException
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        ArrayList<Double> elements = new ArrayList<>();
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String word = scanner.next();
            if (word.equals("END")) {
                break;
            }
            try {
                double arrayParseDouble = Double.parseDouble(word);
                System.out.println(arrayParseDouble);
                sum = sum + arrayParseDouble;
                if (sum < 0) {
                    throw new ArithmeticException();
                }
                System.out.println(Math.sqrt(sum));
            } catch (NumberFormatException | ArithmeticException e) {
                Class<? extends RuntimeException> aClass = e.getClass();
                String name = aClass.getName();
                StackTraceElement[] stackTrace = e.getStackTrace();
                Class<TaskB> taskB = TaskB.class;
                String nameClass = taskB.getName();
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    if (className.equals(nameClass)) {
                        int number = stackTraceElement.getLineNumber();
                        System.out.printf("name: %s\n" +
                                "class: %s\n" +
                                "line: %d", name, taskB, number);
                    }
                }
                break;

            }
        }
    }
}
























package SEM_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

//Реализовать консольное приложение, которое:
//Принимает от пользователя и “запоминает” строки.
//Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//Если введено revert, удаляет предыдущую введенную строку из памяти.
public class Task2 {
    //        private static Stack<String> stack = new Stack<>();
    private static Deque<String> stack = new ArrayDeque<>();

    private static String getString() {
        System.out.println("Введите строку");
        Scanner in = new Scanner(System.in);
        return in.next();
    }

    private static void save(String in) {
        stack.push(in);
    }

    private static void run(String in) {
        if (in.equalsIgnoreCase("q")) System.exit(0);
        else if (in.equalsIgnoreCase("print")) {
            System.out.println(stack);
        } else if (in.equalsIgnoreCase("revert")) {
            revert();
        } else {
            save(in);
        }
    }

    private static void revert() {
        stack.pop();
        System.out.println(stack);
    }

    public static void main(String[] args) {
        while (true) {
            String in = getString();
            run(in);
        }
    }
}

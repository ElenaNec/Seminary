package SEM_4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TaskTest {
    private static final Deque<String> strings = new ArrayDeque<>();

    public static void run() {
        while (true) {
            String in = prompt();
            if (in.equalsIgnoreCase("Q")) System.exit(0);

            if (in.equalsIgnoreCase("print")) {
                System.out.println(strings);
            }

            else if (in.equalsIgnoreCase("revert")) {
                strings.pop();
                System.out.println(strings);
            } else {
                strings.push(in);
            }
        }
    }

    private static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void main(String[] args) {
        run();
    }
}

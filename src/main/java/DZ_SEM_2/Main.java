package DZ_SEM_2;

import org.json.simple.parser.ParseException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws ParseException, IOException {

//  Задание 1
        Task1 task1 = new Task1();
        task1.map();

        System.out.println("\n");

//  Задание 3
        Task3 task3 = new Task3();
        task3.parseString();
    }
}

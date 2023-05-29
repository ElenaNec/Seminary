package org.example.Sem_2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

//Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту
//строку в простой текстовый файл, обработайте исключения.
public class Task2 {
    private static Logger logger = Log.log(Task2.class.getName());

    public void write(String string){
        String str = createStr(string);
        //System.out.println("Длина повторяемой строки = " + str.length());
        logger.log(Level.INFO,"Длина повторяемой строки = " + str.length());

        try (FileWriter in = new FileWriter("test.txt");) {
            in.write(str);
            //System.out.println("записано");
            logger.log(Level.INFO, "записано");
//            divide(2, 0);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private String createStr(String str){
        StringBuilder builder =new StringBuilder();
        for (int i = 0; i < 100 ; i++) {
            builder.append(str);
        }
        // можно записать вместо цикла:  builder.append(String.valueOf(str).repeat(100));
        return builder.toString();
    }
    private double divide(int a, int b){
        if (b == 0) throw new DivideByZero("На ноль делить нельзя");
        return a / b;
    }
}

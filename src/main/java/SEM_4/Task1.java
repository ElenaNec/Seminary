package SEM_4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Реализовать консольное приложение, которое:
//Принимает от пользователя строку вида text:num
//Нужно сделать “сплит” строки по : , сохранить text в связный список на позицию num.
//Если введено print:num, выводит строку из позиции num в связном списке и удаляет её из списка.
public class Task1 {
    private static List<String> strings = new LinkedList<>();
    private static String getString(){
        System.out.println("Введите строку вида \"text:num\"");
        Scanner in = new Scanner(System.in);
        return in.next();
    }
    private static void save(){
        String input = getString();
        String[] split = input.split(":");
        int index = Integer.parseInt(split[1]);
        if(index > strings.size()){
            for (int i = 0; i < index; i++) {
                strings.add(null);
            }
        }
        String text = split[0];
        if (text.equalsIgnoreCase("print")){
            System.out.println(strings.get(index));
            strings.remove(index);
        } else {
            strings.add(index, text);
        }
    }
    //    private static void printAndDel(int index){
//        System.out.println(strings.get(index));
//        strings.remove(index);
//    }
//    private static void run(String str){
//        if (str.equalsIgnoreCase("print")){
//            printAndDel();
//        }
//    }
    public static void main(String[] args) {
        while(true){
            save();
        }
    }
}

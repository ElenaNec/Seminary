package SEM_5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

//Написать программу, определяющую правильность расстановки скобок в выражении.
//        Пример 1: a+(d*3) - истина
//        Пример 2: [a+(1*3) - ложь
//        Пример 3: [6+(3*3)] - истина
//        Пример 4: {a}[+]{(d*3)} - истина
//        Пример 5: <{a}+{(d*3)}> - истина
//        Пример 6: {a+]}{(d*3)} - ложь
public class Task2 {
    static Map<Character, Character> openToCloseBrackets = new HashMap<>();

    static Deque<Character> openBracketStack = new ArrayDeque<>();

//    private static void fill(){
//        openBracketStack.push('(');
//        openBracketStack.push('{');
//        openBracketStack.push('<');
//        openBracketStack.push('[');
//    }

    private static void fillMap(){
        openToCloseBrackets.put('(', ')');
        openToCloseBrackets.put('{', '}');
        openToCloseBrackets.put('<', '>');
        openToCloseBrackets.put('[', ']');


    }
    private static boolean isBracketCorrect(String str){
        fillMap();
        for (char element : str.toCharArray()){
            if (openToCloseBrackets.containsKey(element)) openBracketStack.add(element); // Если текущий эелмент является ключом.
            else if (openToCloseBrackets.containsValue(element)) { // Если текущий эелемент ялвется значением.
                if (openToCloseBrackets.isEmpty()) return false;
                char top = openBracketStack.removeLast();
                if (openToCloseBrackets.get(top) != element) return false;
            }
        }
        return openBracketStack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBracketCorrect("<{a}+{(d*3)}>"));
    }

}

package SEM_3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//Заполнить список названиями планет Солнечной системы в
// произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
public class Planets {
    private static List<String> planets = new ArrayList<>();
    public static void main(String[] args) {
//        printPlanets();
        removeEqualElements(planets);
    }
    private static void fillPlanets(){
        planets.add("Меркурий");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Земля");
    }
    private static void printPlanets(){
        fillPlanets();
        StringBuilder sb = new StringBuilder();
        List<String> result = new LinkedList<>();
        for (int i = 0; i < planets.size(); i++) {
            String currentPlanet = planets.get(i);
            if (!result.contains(currentPlanet)){
                result.add(currentPlanet);
                int count = 0;
                for (int j = 0; j < planets.size(); j++) {
                    if (planets.get(j).equals(currentPlanet)) count++;
                }
                sb.append(currentPlanet).append(" : ").append(count).append(" ");
            }
        }
        System.out.println(sb);
    }
    private static void removeEqualElements(List<String> elements){
        fillPlanets();
        elements.sort(String::compareTo);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i).equals(elements.get(i - 1))) elements.remove(elements.get(i));
            System.out.println(i);
        }
        System.out.println(elements);
        System.out.println(elements.get(elements.size() - 1));
        System.out.println(elements.get(elements.size() - 2));
        System.out.println(elements.get(elements.size()-1).equals(elements.get(elements.size()-2)));
        if (elements.get(elements.size() - 1).equals(elements.get(elements.size() - 2))) elements.remove(elements.get(elements.size()-1));
        System.out.println(elements);

//        if (elements.get(elements.size()).equals(elements.size() - 1))
//            elements.remove(elements.size()-1);
////        System.out.println(elements);
    }
}

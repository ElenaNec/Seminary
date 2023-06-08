package DZ_SEM_5;

import java.math.BigInteger;
import java.util.*;

//Реализуйте структуру телефонной книги с помощью HashMap.
//Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

public class PhoneBook {
    static Map<String, ArrayList<String>> phonebook = new HashMap<>();

    public void phoneNameAdd(){
        phonebook.put("Степанов Сергей", new ArrayList<>());
        phonebook.put("Степанов Петр", new ArrayList<>());
        phonebook.put("Соловьев Андрей", new ArrayList<>());
        phonebook.put("Новиков Алексей", new ArrayList<>());
        phonebook.put("Котенкова Лиза", new ArrayList<>());
        phonebook.put("Тимуров Никита", new ArrayList<>());
        phonebook.put("Дунаева Светлана ", new ArrayList<>());
        phonebook.put("Ковалев Данила", new ArrayList<>());
    }

    public void getPhoneNumber(){
        Set<String> keys = phonebook.keySet();
        List<String> phoneNumbers = new ArrayList<>(keys);
        for (String s : phoneNumbers) {
            ArrayList<String> getArray = phonebook.get(s);
            for (int i = 0; i < sizeArrayNumber() + 1; i++) {
                getArray.add(generatePhone());
            }
        }
        System.out.println(phonebook);
    }

    private int sizeArrayNumber(){
        Random random = new Random();
        return random.nextInt(3);
    }

    public String generatePhone(){
        Random random = new Random();
        StringBuilder tel = new StringBuilder("+7(495)");
        int randomTel = (Math.abs(random.nextInt() * random.nextInt()) % 10000000);
        tel.append(randomTel);
        return tel.toString();
    }
    public void sortedPrint() {
        Comparator<Map.Entry<String, ArrayList<String>>> valueComparator = ((o1, o2) ->
                Integer.compare(o2.getValue().size(), o1.getValue().size()));
        // Получаем список значений HashMap, сортируем его по размеру ArrayList и выводим в консоль
        List<Map.Entry<String, ArrayList<String>>> sortedList = new ArrayList<>(phonebook.entrySet());
        sortedList.sort(valueComparator);
        sortedList.forEach(System.out::println);
    }

}

package DZ_SEM_2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//1) Дана строка sql-запроса "select * from students where ".
//        Сформируйте часть WHERE этого запроса, используя StringBuilder.
//        Данные для фильтрации приведены ниже в виде json-строки.
//        Если значение null, то параметр не должен попадать в запрос.
//        Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
public class Task1 {

   public void map() {
        Map<String, String> map;

        {
            map = new LinkedHashMap<>();
            map.put("name", "Ivanov");
            map.put("country", "Russia");
            map.put("city", "Moscow");
            map.put("age", "null");

            for (Map.Entry<String, String> entry : map.entrySet()) {
                String value = entry.getValue();
                if (value == "null") break;
                System.out.print(value + " ");
            }
        }

    }
}


package DZ_SEM_2;
//3) Дана json-строка (можно сохранить в файл и читать из файла)
//    [{"фамилия":"Семенов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Биология"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//    Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//    Пример вывода:
//    Студент Семенов получил 5 по предмету Математика.
//    Студент Петрова получил 4 по предмету Биология.
//    Студент Краснов получил 5 по предмету Физика.

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.IOException;

public class Task3 {
    public void parseString() throws IOException, ParseException {

        String jsonString = "[{\"фамилия\":\"Семенов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Биология\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";


        Object obj = new JSONParser().parse(jsonString);
        JSONArray jsonArray = (JSONArray) obj;
        for(Object item : jsonArray) {
            JSONObject jsonObject = (JSONObject) item;
            System.out.println("Студент " + jsonObject.get("фамилия")
                    + " получил " + jsonObject.get("оценка")
                    + " по предмету " + jsonObject.get("предмет"));
        }
    }
}
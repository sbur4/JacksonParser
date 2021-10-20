import entity.Car;
import entity.Root;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class SimpleParser {

    public Root parse() {
        Root root = new Root();
        JSONParser parser = new JSONParser();

        try (FileReader reader = new FileReader("test.json")) {
            JSONObject rootJson = (JSONObject) parser.parse(reader);
            String stringTest = (String) rootJson.get("stringTest");

            JSONArray arrayTestJson = (JSONArray) rootJson.get("arrayTest");
            List<Car> carList = new ArrayList<>();
            for (Object it : arrayTestJson) {
                JSONObject carJson = (JSONObject) it;
                String name = (String) carJson.get("name");
                String model = (String) carJson.get("model");


                Car car = new Car(name, model);
                carList.add(car);
            }

            root.setStringTest(stringTest);
            root.setArrayTest(carList);

            return root;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

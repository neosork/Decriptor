import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DictionaryIdentification {
    final static String pathToDictionary = "./russian2.txt";

    static BufferedReader reader;

     {
        try {
            reader = new BufferedReader(new FileReader(pathToDictionary));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static String str;

    public static ArrayList<String> getDictionary() throws IOException {
        ArrayList<String> list = new ArrayList<String>();
        while ((str = reader.readLine()) != null) {
            if (!str.isEmpty()) {
                list.add(str);
                System.out.println(str);
            }
        }
        return list;
    }


}

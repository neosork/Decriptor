import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class BrutForse {


    public boolean validateDictionry(ArrayList<String> arr){
        boolean success = false;
        int count = 0;
        ArrayList<String> strArr = new ArrayList<>();

        try {
          strArr = getDictionary();
        } catch (Exception e){
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            if(strArr.contains(arr.get(i))){
                count++;
            }
        }

        if (count >= 8){
            return true;
        } else return false;

    }



    static BufferedReader reader;

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

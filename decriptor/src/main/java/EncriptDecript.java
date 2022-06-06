import java.util.HashMap;
import java.util.TreeMap;

public class EncriptDecript {

    private int sizeOfString;


    private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
            'и', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
            'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

    private static HashMap<Character, Integer> charInt = new HashMap<>();

    private void newHashMap() {
        for (int i = 0; i < ALPHABET.length; i++) {
            charInt.put(ALPHABET[i], 0);
        }
    }


    private int takeIndex(char c) {
        int i;
        for (i = 0; i < ALPHABET.length; i++) {
            if (ALPHABET[i] == c) {
                return i;
            }
        }
        return i;

    }

        private char newChar ( char c, int step){
            int outputIndex = takeIndex(c) + step;

            if (outputIndex < ALPHABET.length) {
                return ALPHABET[outputIndex];
            } else {
                return ALPHABET[outputIndex - ALPHABET.length];
            }

        }
        private char newCharDecript (char c, int step){
        int outputIndex = takeIndex(c) - step;

        if (outputIndex >= 0) {
            return ALPHABET[outputIndex];
        } else {
            return ALPHABET[outputIndex - ALPHABET.length];
        }

    }
        private char[] remakeStringToCharArray (String s){

            sizeOfString = s.toCharArray().length;
            return s.toCharArray();

        }

        public String encriptorString (String str,int step){
            char[] stringToChar;
            stringToChar = remakeStringToCharArray(str);
            char[] newArrayChar = new char[sizeOfString];
            for (int i = 0; i < stringToChar.length; i++) {
                newArrayChar[i] = newChar(stringToChar[i], step);
                //System.out.println(newArrayChar[i]);
            }

            String newString = new String(newArrayChar);

           // System.out.println(newString);

            return newString;
        }

        public String decriptorString (String str, int step) {
        char[] stringToChar;
            stringToChar = remakeStringToCharArray(str);
            char[] newArrayChar = new char[sizeOfString];
            for (int i = 0; i < stringToChar.length; i++) {
                newArrayChar[i] = newCharDecript(stringToChar[i], step);
            }

            String newString = new String(newArrayChar);

            return newString;
        }


        


    }


import java.util.Arrays;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    Boolean symetric = false;

    ROT13(Character cs, Character cf) {
        if(toLowerCase(cs) == 'a' && toLowerCase(cf) == 'n'){
            symetric = true;
        }
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return text;
    }

    public String encrypt(String text) {
        String encryptedText = "";
        char[] textCharArr = text.toCharArray();
        for (int i = 0; i < text.length() ; i++) {
            if(String.valueOf(text.charAt(i)).matches("[A-Z,a-z]"))
                if (isUpperCase(textCharArr[i])) {
                    textCharArr[i] = (char) (((int) textCharArr[i] + 13 - 65) % 26 + 65);
                } else {
                    textCharArr[i] = (char) (((int) textCharArr[i] + 13 - 97) % 26 + 97);
                }
            encryptedText = encryptedText.concat(String.valueOf(textCharArr[i]));
        }

        return encryptedText;
    }

    public String decrypt(String text) {
        return encrypt(text);
    }

    public static String rotate(String s, Character c) {
        int offset = s.indexOf(c);
//        int i = offset % s.length();

        return s.substring(offset) + s.substring(0,offset);

    }
    private String substituteIn(String text, String startUpper,String registerUpper, String startLower,String registerLower){return "";}

}

package text_transform.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TextTransformUtilImpl implements TextTransformUtil {

    @Override
    public List textTransform(String entryText) {

        List<Character> substitutionLetters = new ArrayList<>(Arrays.asList('a','e','i','o','u','á','é','í','ó','ú','ů'));

        List<Character> arrayOfChars = new ArrayList<>();
        for (Character character : entryText.toCharArray()) {
            if (substitutionLetters.contains(character)) {
                arrayOfChars.add(Character.toUpperCase(character));
            } else if (substitutionLetters.contains(Character.toLowerCase(character))) {
                arrayOfChars.add(Character.toLowerCase(character));
            } else {
                arrayOfChars.add(Character.toLowerCase(character));
            }
        }
        System.out.println(arrayOfChars);

        String transformedText = "";
        for (Character character : arrayOfChars) {
            transformedText += " " + String.valueOf(character);
        }


        System.out.println(new StringBuilder(transformedText).reverse().toString());
        return arrayOfChars;
    }
}

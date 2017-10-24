package text_transform.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TextTransformUtilImpl implements TextTransformUtil {

    @Override
    public String textTransform(String entryText) {

        if (entryText == null) {return null;}

        List<Character> substitutionLetters = new ArrayList<>(Arrays.asList('a','e','i','o','u','á','é','í','ó','ú','ů'));
        String transformedText = "";

        for (Character character : entryText.toCharArray()) {
            if (substitutionLetters.contains(character)) {
                transformedText += Character.toUpperCase(character);
            } else if (substitutionLetters.contains(Character.toUpperCase(character))) {
                transformedText += Character.toLowerCase(character);
            } else {
                transformedText += Character.toLowerCase(character);
            }
        }

        return new StringBuilder(transformedText).reverse().toString();
    }
}

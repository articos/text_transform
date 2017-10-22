package text_transform.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextTransformUtilImpl implements TextTransformUtil {

    @Override
    public List textTransform(String entryText) {

        List<Character> arrayOfChars = new ArrayList<>();
        for (Character character : entryText.toCharArray()) {
            if ((character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o')) || character.equals('u')) {
                arrayOfChars.add(Character.toUpperCase(character));
            } else {
                arrayOfChars.add(character);
            }
        }

        List<Character> reverseText = new ArrayList<>();
        Collections.reverse(new ArrayList(arrayOfChars));


        System.out.println(arrayOfChars);
        return arrayOfChars;
    }
}

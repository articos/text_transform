package text_transform.test;

import org.junit.Test;
import text_transform.util.TextTransformUtil;
import text_transform.util.TextTransformUtilImpl;

import static org.junit.Assert.*;

public class TextTransformUtilTest {
    @Test
    public void textTransform() throws Exception {

        TextTransformUtil toTransform = new TextTransformUtilImpl();

        assertEquals("Ahoj -> jOha","jOha",toTransform.textTransform("Ahoj"));
    }

}
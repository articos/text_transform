package text_transform;


import text_transform.util.TextTransformUtil;
import text_transform.util.TextTransformUtilImpl;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");

        System.out.println("Zadej text");
        String entryText = sc.nextLine();

        TextTransformUtil toTransform = new TextTransformUtilImpl();

        toTransform.textTransform(entryText);

    }
}

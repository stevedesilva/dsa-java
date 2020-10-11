package data.array;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {

//
//
//
//        String result = reverse(input);
//        System.out.println(result);

    }

//
//    public String reverse(String input) {
//        System.out.printf("Received [%s] input", input);
//        String[] inputAsChar = input.split("");
//        String[] result = new String[input.length()];
//        int count = 0;
//        for (int i = inputAsChar.length -1; i >= 0; i--) {
//            result[count] = inputAsChar[i];
//            System.out.printf("Result %d value %s\n", count,result[count]);
//
//            count++;
//        }
//
////        String reversedString = Arrays.toString(result);
////        String reversedString = new String(result,reversedString);
//
//        System.out.printf("Reversed string input %s", reversedString);
//
//        return reversedString;
//    }


    public String reverseDecrement(String input) {
        if (input == null || input.isBlank() || input.isEmpty()) {
            return input;
        }
        System.out.printf("Received [%s] input", input);
        char[] inputAsChar = input.toCharArray();
        char[] result = new char[inputAsChar.length];
        byte count = 0;
        for (int i = inputAsChar.length - 1; i >= 0; i--) {
            result[count] = inputAsChar[i];
            count++;
        }

//        Collections.reverse();

        System.out.printf("Reversed string %s\n", result);

        return new String(result);


    }

    public String reverseIncrement(String input) {
        if (input == null || input.isBlank() || input.isEmpty()) {
            return input;
        }
        System.out.printf("Received [%s] input", input);
        char[] inputAsChar = input.toCharArray();
        char[] result = new char[inputAsChar.length];

        for (int i = 0; i < inputAsChar.length; i++) {
            result[i] = inputAsChar[inputAsChar.length - i -1];
        }


        System.out.printf("Reversed string %s\n", result);

        return new String(result);

    }
}

package data.recursion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringReversal {

    private boolean checkNull(String str) {
        if (str == null) {
            return true;
        }
        return false;
    }

    public String reverseStringRecursive(String string) {
        if (string.equals("")) {
            return "";
        }

        final char c = string.charAt(0);
        final String substring = string.substring(1);
        return reverseStringRecursive(substring) + c;
    }

    //Implement a function that reverses a string using iteration...and then recursion!
    public String reverseStringRecursive(String str, StringBuilder acc) {
        /*
             reverseString('yoyo mastery')
             should return: 'yretsam oyoy'
         */
        int length = str.length();
        System.out.printf(">> Length %d \n", length);
        System.out.printf(">> str %s\n",str);

        if (str.length() == 0) {

            final String s = acc.toString();
            System.out.printf("<< %s\n",s);
            return s;
        }
        System.out.printf("<< acc\t (%s)\n",acc);
        return reverseStringRecursive(str.substring(0,length-1),acc.append(str.charAt(length -1)));

    }

    public String reverseStringIterativeArray(String str) {
        if (checkNull(str)) return "";

        byte[] input = str.getBytes();
        byte[] output = new byte[input.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = input[input.length - 1 - i];

        }
        return new String(output);
    }

    public String reverseStringIterativeBuilder(String str) {
        if (checkNull(str)) return "";

        StringBuilder builder = new StringBuilder(str); // users array under the hood
        return builder.reverse().toString();
    }

    public String reverseStringIterativeBuilder2(String str) {
        if (checkNull(str)) return "";

        StringBuilder builder = new StringBuilder(); // users array under the hood

        for (int i = str.length() - 1; i >= 0; i--) {

            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

}




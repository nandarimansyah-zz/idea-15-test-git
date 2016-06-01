package com.java.testidea.helper;

/**
 * Created by nanda on 6/1/16.
 */
public class HelperClass1 {

    public static String combineString(String delimeter, String... strings) {
        StringBuilder sb = new StringBuilder();

        for(String s : strings) {
            sb.append(s).append(delimeter);
        }
        sb.delete(sb.length() - 1, sb.length());

        return sb.toString();
    }
}

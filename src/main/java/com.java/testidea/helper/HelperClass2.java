package com.java.testidea.helper;

import java.util.Arrays;

/**
 * Created by nanda on 6/1/16.
 */
public class HelperClass2 {

    public static int add(int... numbers) {
        return Arrays.stream(numbers).sum();
    }
}

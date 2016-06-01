package com.java.testidea;

import com.java.testidea.helper.HelperClass1;
import com.java.testidea.helper.HelperClass2;

/**
 * Created by nanda on 6/1/16.
 */
public class Application {

    public static void main(String[] args) {
        System.out.println(HelperClass1.combineString(",", "a", "b"));
        System.out.println(HelperClass2.add(1, 2, 3));
    }
}

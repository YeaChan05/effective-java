package org.yeachan.chapter2.item6.expensiveobject;

import java.util.regex.Pattern;

/**
 * package :  org.yeachan.chapter2.item6.expensiveobject
 * fileName : RomanNumber
 * author :  ShinYeaChan
 * date : 2023-08-16
 */
public class RomanNumber {
    private static final Pattern ROMAN=Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    static boolean isRomanNumeral(String s){
        return ROMAN.matcher(s).matches();
    }
}

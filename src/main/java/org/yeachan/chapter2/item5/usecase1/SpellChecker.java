package org.yeachan.chapter2.item5.usecase1;

import java.util.List;

/**
 * package :  org.yeachan.chapter2.item5.usecase1
 * fileName : SpellChecker
 * author :  ShinYeaChan
 * date : 2023-08-13
 */
public class SpellChecker {
    private static final Lexicon dictionary=new KoreanDictionary();
    
    private SpellChecker() {
        //초기화 불가
    }
    public static boolean isValid(String word){
        throw new UnsupportedOperationException();
    }
    public static List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
    
    public static void main(String[] args) {
        SpellChecker.isValid("hello");
    }
}
interface Lexicon{}
class KoreanDictionary implements Lexicon {}
package org.yeachan.chapter2.item5.usecase2;

import java.util.List;

/**
 * package :  org.yeachan.chapter2.item5.usecase2
 * fileName : SpellChecker
 * author :  ShinYeaChan
 * date : 2023-08-13
 */
public class SpellChecker {
    private final Lexicon dictionary=new KoreanDictionary();
    private SpellChecker(){
    }
    public static final SpellChecker INSTANCE=new SpellChecker(){
    };
    public boolean isValid(String word){
        throw new UnsupportedOperationException();
    }
    public List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
    
    public static void main(String[] args) {
        SpellChecker.INSTANCE.isValid("hello");
    }
}
interface Lexicon{}
class KoreanDictionary implements Lexicon{}
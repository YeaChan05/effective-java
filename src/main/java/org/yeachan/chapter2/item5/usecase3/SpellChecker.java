package org.yeachan.chapter2.item5.usecase3;

import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * package :  org.yeachan.chapter2.item5.usecase3
 * fileName : SpellChecker
 * author :  ShinYeaChan
 * date : 2023-08-13
 */
public class SpellChecker {
    private final Lexicon dictionary;
    public SpellChecker(Lexicon dictionary){
        this.dictionary=Objects.requireNonNull(dictionary);
    }
    public SpellChecker(Supplier<Lexicon> dictionary){
        this.dictionary=Objects.requireNonNull(dictionary.get());
    }
    public boolean isValid(String word){
        throw new UnsupportedOperationException();
    }
    public List<String> suggestions(String typo){
        throw new UnsupportedOperationException();
    }
    
    public static void main(String[] args) {
        Lexicon lexicon=new KoreanDictionary();
//        Lexicon lexicon=new TestDictionary();// 적당히 갈아 끼울 수 있다!
//        SpellChecker spellChecker=new SpellChecker(() -> lexicon);
        SpellChecker spellChecker=new SpellChecker(lexicon);
        spellChecker.isValid("hello");
    }
}
interface Lexicon{}
class KoreanDictionary implements Lexicon{}
class TestDictionary implements  Lexicon{}
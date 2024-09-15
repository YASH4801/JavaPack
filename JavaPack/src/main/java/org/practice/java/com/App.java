package org.practice.java.com;

import java.util.List;
import java.util.Stack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        UltimateClass u = new UltimateClass();
        u.getSealedClassData("UltimateClass");
        OrphanClass o = new OrphanClass();
        o.getSealedClassData("OrphanClass");

        System.out.println(reverseWords("this is a boy"));
    }

    public static String reverseWords(String s) {
        List<String> wordList = List.of(s.split(" "));
        Stack<String> stackedWords = new Stack();
        stackedWords.addAll(wordList);
        final StringBuilder result = new StringBuilder();
        stackedWords.stream().map(stWords -> result.append(stWords + ""));
        return result.toString().trim();
    }
}

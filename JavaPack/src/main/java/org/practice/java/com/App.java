package org.practice.java.com;

import org.practice.java.com.LeetCode.Solutions.InterviewSeries.Arrays.MirrorArray;

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
//        int[][] testArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        MirrorArray solution = new MirrorArray();
//        solution.rotate(testArray);
        System.out.println(removeDigit("123", '3'));

    }

    public static String reverseWords(String s) {
        List<String> wordList = List.of(s.split(" "));
        Stack<String> stackedWords = new Stack();
        stackedWords.addAll(wordList);
        final StringBuilder result = new StringBuilder();
        stackedWords.stream().map(stWords -> result.append(stWords + ""));
        return result.toString().trim();
    }

    public static String removeDigit(String number, char digit) {
        var list = number.split("");
        for (int i = 0; i < list.length; i++){
            if(list[i].equals(String.valueOf(digit)) && i < list.length-1 ){
                if(Integer.valueOf(list[i]) < Integer.valueOf(list[i+1])) {
                    return getUpdatedString(number, i);
                }
                break;
            }
        }
        for(int j = list.length - 1; j >= 0; j--){
            if(list[j].equals(String.valueOf(digit))) {
                return getUpdatedString(number, j);
            }
        }
        return null;
    }

    public static String getUpdatedString(String number, int j){
        var result = new StringBuilder(number);
        var resultAfterDelete =  result.deleteCharAt(j).toString();
        return resultAfterDelete;
    }
}

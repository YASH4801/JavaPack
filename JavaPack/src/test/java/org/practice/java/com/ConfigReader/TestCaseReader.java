package org.practice.java.com.ConfigReader;

import org.practice.java.com.ConfigReader.models.PathConstants;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TestCaseReader {
    
    private static  List<String> readTestCases(Path path) throws IOException {

        // Read the test case file
        List<String> testCases = Files.readAllLines(path);
        return testCases;
    }

    public static Path pathBuilder(PathConstants fileParent,
     PathConstants fileNamePrototype, int number, PathConstants extention) throws IOException {
        return Path.of(fileParent.getValue(), getFileName(fileNamePrototype, number, extention));
    }

    private static String getFileName(PathConstants fileNamePrototype, int number, PathConstants extention) {
        return fileNamePrototype.getValue() + String.valueOf(number) + extention.getValue();
    }

    public static List<List<String>> loadTestCase(int linesPerCase, int caseId) throws IOException{
        // Load the test case file
        var testCasePath = pathBuilder(PathConstants.LEETCODE_TC_PATH, PathConstants.TESTCASE, caseId, PathConstants.TEXT_EXT);
        var testData = readTestCases(testCasePath);
        int count = 0;
        int iterator = 0;

        var caseList = new ArrayList<List<String>>();
        while (iterator < testData.size()) {
            if((count + 1) == linesPerCase){
                caseList.add(testData.subList(iterator - linesPerCase + 1, iterator + 1));
                count = 0;
            } else {
                count++;
            }
            iterator++;
        }
        
        return caseList;
    }
}
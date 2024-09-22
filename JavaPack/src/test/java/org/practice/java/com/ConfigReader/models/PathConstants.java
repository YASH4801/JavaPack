package org.practice.java.com.ConfigReader.models;


public enum PathConstants{
    LEETCODE_TC_PATH("src\\main\\resource\\TestCases\\LeetCode"),
    TESTCASE("TC_LC"),
    TEXT_EXT(".txt");

    PathConstants(String path) {
        this.value = path;
    }

    private String value;

    public String getValue() {
        return value;
    }

}
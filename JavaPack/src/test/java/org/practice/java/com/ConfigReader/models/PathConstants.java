package org.practice.java.com.ConfigReader.models;

import lombok.Getter;


public enum PathConstants{
    LEETCODE_TC_PATH("src\\main\\resource\\TestCases\\LeetCode"),
    TESTCASE("TC_LC"),
    TEXT_EXT(".txt");

    PathConstants(String path) {
        this.value = path;
    }

    @Getter
    private String value;

}
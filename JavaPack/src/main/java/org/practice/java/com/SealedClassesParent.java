package org.practice.java.com;

public sealed class SealedClassesParent permits TestSealedChild1, TestSealedChild2 {

    protected void getSealedClassData(String reward){
        System.out.println("Sealed class parent called by : " + reward);    }
}

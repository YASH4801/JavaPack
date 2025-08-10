package org.practice.java.com;

import java.util.ArrayList;
import java.util.List;

public class TestPractice {
    public static void main(String[] args) {
        System.out.println("Hello, Practice!");
        List<Alphabet> alphas = List.of(new A(), new B(), new Y(), new Z());

    }

    public static void printAlphabet(Alphabet alphabet, Class<? extends Alphabet> classType) {
        System.out.println((classType.getClass().cast(alphabet)));
    }
}

// Define the interface Alphabet
interface Alphabet {
    void printLetter();
}

// Generate classes A to Z
class A implements Alphabet {
    private char letter = 'A';

    public void printLetter() {
        System.out.println("Letter: " + letter);
    }

    public char getLetter() {
        return letter;
    }
}

class B implements Alphabet {
    private char letter = 'B';

    public void printLetter() {
        System.out.println("Letter: " + letter);
    }

    public char getLetter() {
        return letter;
    }
}

// ... continue with classes C to Z and their getter methods

class Y implements Alphabet {
    private char letter = 'Y';

    public void printLetter() {
        System.out.println("Letter: " + letter);
    }

    public char getLetter() {
        return letter;
    }
}

class Z implements Alphabet {
    private char letter = 'Z';

    public void printLetter() {
        System.out.println("Letter: " + letter);
    }

    public char getLetter() {
        return letter;
    }
}

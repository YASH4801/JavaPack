package org.practice.java.com;

import java.util.List;

public class AnimalLength {

    public static int length(String animal_sequence) {
        String animals = animal_sequence.replace("|", "");
        List<String> animalsList = List.of(animals.split("-"));
        animalsList = animalsList.stream().filter(animal -> animal.length() >= 2).toList();
        return Integer.parseInt(animalsList.get(animalsList.size()-1));
    }

    public void testCommit(){
        System.out.println("pushing test commit to master directly....");
    }

    public void testCommitForPR(){
        System.out.println("pushing test commit through Pull Request...");
    }
}

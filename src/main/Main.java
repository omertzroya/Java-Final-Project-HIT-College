package main;

import main.java.com.hit.algorithm.IAlgoStrings;
import main.java.com.hit.algorithm.kmpAlgo;

public class Main {
    public static void main(String[] args) {
        String text = "abcdadadadabc";
        String pattern = "dad" ;

        IAlgoStrings<String> kmpString = new kmpAlgo<>();
        // Search for the pattern in the text
        int result = kmpString.search(text, pattern);

        if (result != -1) {
            System.out.println("Pattern found at index " + result);
        } else {
            System.out.println("Pattern not found in the text");
        }

    }
}
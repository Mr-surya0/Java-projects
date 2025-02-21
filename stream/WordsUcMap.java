package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StringLengthMultiplier {
    private String str;

    public StringLengthMultiplier(String str) {
        this.str = str;
    }

    public int calculateLengthAndMultiplyByTwo() {
        return str.length() * 2;
    }
    public int calculateLength() {
        return str.length();
    }
    @Override
    public String toString() {
        return str;
    }
}

public class WordsUcMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java", "stream", "map");

        List<String> result = words.stream()
                .map(StringLengthMultiplier::new)
                .map(str -> {
                
                    int length = str.calculateLength();
                    System.out.println(str + " - Length  " + length);
                    
                    
                    int lengthmultiplied=str.calculateLengthAndMultiplyByTwo();
                    return lengthmultiplied;
                })
                .map(String::valueOf)
                .collect(Collectors.toList());

        System.out.println("Result length multiplied by 2: " + result);
    }
}
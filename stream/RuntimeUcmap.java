package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RuntimeUcmap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter words separated by spaces:");
        String input = scanner.nextLine();

        String[] wordsArray = input.split(" ");
        List<String> words = new ArrayList<>(Arrays.asList(wordsArray));

        List<Integer> result = words.stream()
                .map(String::length)
                .map(length -> {
                    System.out.println("Length: " + length);
                    return length * 2;
                })
                .collect(Collectors.toList());

        System.out.println("Result length multiplied by 2: " + result);
    }
}


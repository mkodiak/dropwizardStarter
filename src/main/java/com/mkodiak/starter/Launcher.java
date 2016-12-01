package com.mkodiak.starter;

import java.util.Arrays;

public class Launcher {

    public static void main(String[] args) {
        System.out.println("Your arguments are: ");

        Arrays.stream(args).forEach((arg) -> System.out.println(arg));
    }
}

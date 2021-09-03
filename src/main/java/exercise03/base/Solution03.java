package exercise03.base;
/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Zakaria Antifit
 */

import java.util.Scanner;

public class Solution03 {
/*
 * print "What is the quote"
 * 'quote' = user input string
 * print "Who said it?"
 * 'author' = user input string
 * print "'author' says, 'quote'
 */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String quote = input.nextLine();

        System.out.print("Who said it? ");
        String author = input.nextLine();

        System.out.println(author + " says, " + "\"" + quote + "\"");
    }
}

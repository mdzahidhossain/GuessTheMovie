package com.company;

import java.util.Scanner;

public class Main {
    public static int OutAll(String mainName, String Duplicatenames, String wrongsName, int ct, int wrongInput) {
        System.out.print("You are guessing:");
        for (int i = 0; i < mainName.length(); i++) {
            if (Duplicatenames.indexOf(mainName.charAt(i)) == -1)
                System.out.print("_");
            else {
                System.out.print(mainName.charAt(i));
                ct++;
            }
        }
        System.out.println();
        System.out.print("You have gussed (" + wrongInput + ") wrong letters:");
        for (int i = 0; i < wrongsName.length(); i++) {
            System.out.print(wrongsName.charAt(i) + " ");
        }
        System.out.print("\n");

        return ct++;

    }

    public static void main(String[] args) {
        // write your code here
        String Duplicatenames = "", mainName, wrongsName = "";
        int wrongInput = 0, correctInput = 0;
        mainName = Output.NameTittle();
        Scanner Letter = new Scanner(System.in);
        correctInput = OutAll(mainName, Duplicatenames, wrongsName, 0, wrongInput);
        while (correctInput != mainName.length() && wrongInput != 10) {
            System.out.print("Guess a letter:");
            //input a letter
            String inputChar = Letter.nextLine();
            if (mainName.contains(inputChar)) Duplicatenames = Duplicatenames + inputChar;
            else {
                wrongsName = wrongsName + inputChar;
                wrongInput++;
            }
            correctInput = OutAll(mainName, Duplicatenames, wrongsName, 0, wrongInput);
        }
        if (wrongInput == 10) {
            System.out.println("\nYou lose!");
        } else {
            System.out.println("You Win!");
            System.out.println("You have guessed  " + mainName +" correctly");
        }
    }

}

package com.LeahGrace;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class ScannerFunctionRead {

    public static void Read() {

        Stack<Character> bracketStack = new Stack<>(); // Declare stack to collect/evaluate brackets (return error if brackets missing/miss-matched)

        Scanner scan = new Scanner(System.in); // Declare scanner to collect input

        //Scan for Method Declaration
        String[] methodDeclaration = null;

        // Declare multidimensional array to store following lines of code
        ArrayList<String> methodScript = new ArrayList<>();

        //Read all following lines of code (function must be limited to 20-ish lines, Send error to refactor. )
        try {
            while (scan.hasNextLine()) {
                String nextMethodLine = scan.nextLine();

                methodScript.add(nextMethodLine);
                methodScript.add(String.valueOf(nextMethodLine));
                if (nextMethodLine.equals("##")) {
                    scan.close();
                }
            }
        } finally {
            System.out.println("Proceed");
            for (String str : methodScript) {
                System.out.println(str);
            }
        }
/*
        System.out.println("Outside Block");

        for (String str : methodScript){
            System.out.println("NextLine");
            System.out.println(str);
        }

 */
    }

    public static void main(String[] args) {
        Read();
    }

}

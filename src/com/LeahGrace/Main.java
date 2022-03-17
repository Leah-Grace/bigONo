package com.LeahGrace;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Character> bracketStack = new Stack<>(); // Declare stack to collect/evaluate brackets (return error if brackets missing/miss-matched)

        Scanner scan = new Scanner(System.in); // Declare scanner to collect input

        //Scan for Class declaration
        String[] classDeclaration = scan.nextLine().split(" "); // Split class declaration and save to array
        //push bracket to stack
        //Scan for Method Declaration
        String[] methodDeclaration = scan.nextLine().split(" ");
        // push brackets to stack

        // Declare multidimensional array to store following lines of code
        ArrayList<String> methodScript = new ArrayList<>();
        //Read all following lines of code (function must be limited to 20-ish lines, Send error to refactor. )
        while(scan.hasNext()){
            String[] nextMethodLine = scan.nextLine().split(" ");
            methodScript.add(String.valueOf(nextMethodLine));

        }

        for (String str : methodScript){
            System.out.println(str);
        }

    }
}


// Fix: System.In mut be limited
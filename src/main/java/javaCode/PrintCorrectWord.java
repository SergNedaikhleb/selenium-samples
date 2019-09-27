package javaCode;

import java.util.Scanner;

public class PrintCorrectWord {

    public static void main(String[] args) {

        // first of all, we declare a new class Scanner and mew variable
        Scanner scanIt = new Scanner(System.in);

        System.out.println("What is your favourite colour? \n");

        // declare new variable and assign a value to a variable
        String color = scanIt.nextLine();

        //set few conditions
         if (color.equals("green") || color.equals("GREEN") || color.equals("Green")){
         System.out.println(color+ "- it is a very good choice!");
         }else{
            System.out.println("Bad choice!");
         }
    }
}

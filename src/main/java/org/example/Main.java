package org.example;

import java.util.Scanner;

public class Main //a class is a collection of related code. Java file should match class name (Main)
{
    public static void main( String[] args )//This is the main method and is needed
    {
        //User input in java
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("What is your age?");
        int age = sc.nextInt();
        sc.nextLine();//This will clear the scanner. After reading an int, it needs to be cleared
                      //so that the scanner can read a string again after an int.
        System.out.println("What is your favorite food?");
        String food = sc.nextLine();

        System.out.println("Hello "+name+", you are "+age+" and you love "+food);
        
    }
}

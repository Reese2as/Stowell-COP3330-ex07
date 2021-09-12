/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        int L, W, A_feet;
        final float Conversion = 0.09290304f;
        System.out.print("What is the length of the room in feet? ");
        L = user_input.nextInt();
        System.out.print("What is the width of the room in feet? ");
        W = user_input.nextInt();
        System.out.println(String.format("You entered dimensions of %d feet by %d feet", L, W));
        A_feet=(L*W);
        float A_meters = (float)(A_feet*Conversion);
        System.out.println(String.format("The area is\n%d square feet\n%.3f square meters",A_feet,A_meters));
    }
}

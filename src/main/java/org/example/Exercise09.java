/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;

class Ceiling
{
    int l;
    int w;
}

public class Exercise09
{
    public static void main( String[] args )
    {
        Ceiling c = new Ceiling();
        c = inputs(c);
        System.out.println("You will need to purchase " +  Math.ceil((c.l * c.w) /350d) + " gallons of paint to cover " + (c.l * c.w) + " square feet.");
    }

    public static Ceiling inputs(Ceiling c)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "What is the length of the ceiling?" );
        c.l = sc.nextInt();
        System.out.println( "What is the width of the ceiling?" );
        c.w = sc.nextInt();
        return c;
    }
}

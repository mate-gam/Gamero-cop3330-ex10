/*
 *  UCF COP3330 Fall 2021 Assignment 10 Solution
 *  Copyright 2021 Mateo Gamero
 */
import java.io.Console;
import java.lang.Math;
public class App
{
    public static void main (String[] args)
    {
        Console con = System.console();
        System.out.print("Enter the price of item 1: ");
        String i11 = con.readLine();
        float i1 = Float.parseFloat(i11);
        System.out.print("Enter the quantity of item 1: ");
        String q11 = con.readLine();
        float q1 = Float.parseFloat(q11);
        System.out.print("Enter the price of item 2: ");
        String i22 = con.readLine();
        float i2 = Float.parseFloat(i22);
        System.out.print("Enter the quantity of item 2: ");
        String q22 = con.readLine();
        float q2 = Float.parseFloat(q22);
        System.out.print("Enter the price of item 3: ");
        String i33 = con.readLine();
        float i3 = Float.parseFloat(i33);
        System.out.print("Enter the quantity of item 3: ");
        String q33 = con.readLine();
        float q3 = Float.parseFloat(i33);

        float sub = (i1 * q1) + (i2 * q2) + (i3 * q3);
        float realSub = (float) Math.round(sub * 100) / 100;
        float tax = (float) (sub * .055);
        float realTax = (float) Math.round(tax * 100) / 100;
        float total = realTax + realSub;
        float realTotal = (float) Math.round(total * 100) / 100;

        String build = String.format("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", realSub, realTax, realTotal);

        System.out.println(build + "\n");
    }
}

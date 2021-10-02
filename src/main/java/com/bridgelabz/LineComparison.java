package com.bridgelabz;

import java.util.*;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Coordinates();
    }

    static void Coordinates() {
        System.out.print("Enter first line1 co-ordinates ");
        Scanner sc = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        System.out.println("Enter first line2 co-ordinates");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("a1: ");
        double a1 = sc1.nextDouble();
        System.out.print("a2: ");
        double a2 = sc1.nextDouble();
        System.out.print("b1: ");
        double b1 = sc1.nextDouble();
        System.out.print("b2: ");
        double b2 = sc1.nextDouble();
        double length1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("line-1 based on a point consisting of (x, y) co-ordinates is: " + length1);
        double length2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("line-2 based on a point consisting of (x, y) co-ordinates is: " + length2);
        String x = String.valueOf(length1);
        String y = String.valueOf(length2);
        System.out.println(x.equals(y));
    }
}

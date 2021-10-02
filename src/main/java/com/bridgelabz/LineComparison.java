package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Coordinates();
    }
    static void Coordinates(){
        System.out.print("Enter first line1 co-ordinates ");
        Scanner sc = new Scanner(System.in);
        System.out.print("x1: ");
        int x1 = sc.nextInt();
        System.out.print("x2: ");
        int x2 = sc.nextInt();
        System.out.print("y1: ");
        int y1 = sc.nextInt();
        System.out.print("y2: ");
        int y2 = sc.nextInt();

        System.out.println("Enter first line2 co-ordinates");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("a1: ");
        int a1 = sc1.nextInt();
        System.out.print("a2: ");
        int a2 = sc1.nextInt();
        System.out.print("b1: ");
        int b1 = sc1.nextInt();
        System.out.print("b2: ");
        int b2 = sc1.nextInt();

        double length1 = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        System.out.println("line-1 based on a point consisting of (x, y) co-ordinates is: "+length1);
        double length2 = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));
        System.out.println("line-2 based on a point consisting of (x, y) co-ordinates is: "+length2);
    }
}

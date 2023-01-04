package com.BridgeLabz.LineComparison;

import java.util.Scanner;

public class LineComaprison {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Number for X1 : ");
		int x1 = scan.nextInt();
		System.out.print("Enter the Number for y1 : ");
		int y1 = scan.nextInt();
		System.out.print("Enter the Number for X2 : ");
		int x2 = scan.nextInt();
		System.out.print("Enter the Number for y2 : ");
		int y2 = scan.nextInt();
		
		System.out.print("Enter the Number for P1 : ");
		int p1 = scan.nextInt();
		System.out.print("Enter the Number for Q1 : ");
		int q1 = scan.nextInt();
		System.out.print("Enter the Number for P2 : "); 
		int p2 = scan.nextInt();
		System.out.print("Enter the Number for Q2 : ");
		int q2 = scan.nextInt();
		
		double length1 = Math.sqrt((Math.pow((x2-x1), 2))+(Math.pow((y2-y1), 2)));
		double length2 = Math.sqrt((Math.pow((p2-p1), 2))+(Math.pow((q2-q1), 2)));
		
		
		Double Value1 = new Double(length1);
		Double Value2 = new Double(length2);
		
		int compare = Value1.compareTo(Value2);
		
		if(compare == 0 ) 
			System.out.println("Two Lines are Equal ");
		else if(compare > 0)
			System.out.println("Line 1 is Greater than Line 2");
		else
			System.out.println("Line 1 is Lesser than Line 2");
	}
}

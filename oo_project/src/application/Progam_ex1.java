package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Progam_ex1 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.w = sc.nextDouble();
		rectangle.h = sc.nextDouble();
		
		System.out.printf("Area: %.2f %n", rectangle.area());
		System.out.print("Perimeter: " + rectangle.perimeter());
		System.out.println();
		System.out.print("Diagonal: " + rectangle.diagonal());
		
		
		sc.close();
	}
}

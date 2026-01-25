package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Progam_ex2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		System.out.print("Nota 1: ");
		aluno.n1 = sc.nextDouble();
		System.out.print("Nota 2: ");
		aluno.n2 = sc.nextDouble();
		System.out.print("Nota 3: ");
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("Final Grade = %.2f%n", aluno.sumNote());
		System.out.printf("%s %n", aluno.passOrNot());
		if(aluno.miss() != 0) {
			System.out.printf("Missing: %.2f points", aluno.miss());
		};
		
		
		
		sc.close();
	}
}

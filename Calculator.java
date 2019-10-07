package prvipaket;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Znam sve operacije napamet, oko koje zelis da ti pomognem?\n" 
		+ "\t1 - Sabiranje\n"
		+ "\t2 - Oduzimanje\n" 
		+ "\t3 - Mnozenje\n" 
		+ "\t4 - Deljenje\n" 
		+ "\t5 - Ostatak pri deljenju\n"
		+ "\t6 - Srednja vrednost\n"
		+ "Upisi redni broj te operacije: ");
		int oper = sc.nextInt();
		while (oper < 1 || oper > 6) {
			System.err.print("Pogresno unet redni broj. Upisite ponovo: ");
			oper = sc.nextInt();
		}
		System.out.print("Unesi prvi broj: ");
		double br1 = sc.nextDouble();
		System.out.print("Unesi drugi broj: ");
		double br2 = sc.nextDouble();
		switch (oper) {
		case 1:
			System.out.printf("Zbir brojeva " + br1 + " i " + br2 + " je: %.2f", zbir(br1, br2));
			break;
		case 2:
			System.out.printf("Razlika brojeva " + br1 + " i " + br2 + " je: %.2f", razlika(br1, br2));
			break;
		case 3:
			System.out.printf("Proizvod brojeva " + br1 + " i " + br2 + " je: %.2f", mnozenje(br1, br2));
			break;
		case 4:
			System.out.printf("Kolicnik brojeva " + br1 + " i " + br2 + " je: %.2f", deljenje(br1, br2));
			break;
		case 5:
			System.out.printf("Ostatak pri deljenju brojeva " + br1 + " i " + br2 + " je: %.2f", ostatak(br1, br2));
			break;
		case 6:
			System.out.printf("Srednja vrednost brojeva " + br1 + " i " + br2 + " je: %.2f", srednjaVrednost(br1, br2));
			break;
		}
	}

	public static double zbir(double br1, double br2) {
		return br1 + br2;
	}

	public static double razlika(double br1, double br2) {
		return br1 - br2;
	}

	public static double mnozenje(double br1, double br2) {
		return br1 * br2;
	}

	public static double deljenje(double br1, double br2) {
		return br1 / br2;
	}

	public static double ostatak(double br1, double br2) {
		return br1 % br2;
	}

	public static double srednjaVrednost(double br1, double br2) {
		return (br1 + br2) / 2;
	}
}

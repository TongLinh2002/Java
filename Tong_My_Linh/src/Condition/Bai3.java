package Condition;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float a;
		System.out.println("Nhập vào một số:");
		a = scanner.nextFloat();

		if (a > 0) {
			System.out.println("Positive");
		} else if (a == 0) {
			System.out.println("0");
		} else {
			System.out.println("Negative");
		}
		scanner.close();
	}
}

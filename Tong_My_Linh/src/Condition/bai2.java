package Condition;

import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("Nhập vào điểm của học viên:");
		a = scanner.nextInt();
		if (a > 8) {
			System.out.println("Giỏi");
		} else if (a > 6.5 && a < 8) {
			System.out.println("Khá");
		} else if (a > 5 && a < 6.5) {
			System.out.println("Trung bình");
		} else {
			System.out.println("Yếu");
		}
	}

}

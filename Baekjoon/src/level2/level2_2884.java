package level2;

import java.util.Scanner;

public class level2_2884 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		if (num2 < 45) {
			if (num1 > 0) {
				System.out.println((num1 - 1) + " " + ((60 + num2) - 45));
			} else {
				System.out.println(23 + " " + ((60 + num2) - 45));
			}
		} else {
			System.out.println(num1 + " " + (num2 - 45));
		}
	}
}
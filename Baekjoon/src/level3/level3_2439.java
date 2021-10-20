package level3;

import java.util.Scanner;

public class level3_2439 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
}

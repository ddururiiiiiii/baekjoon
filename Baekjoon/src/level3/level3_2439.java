package level3;

import java.util.Scanner;

public class level3_2439 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();

		for (int i = num; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("☆");
			}
			System.out.println("★");
		}
	}
	
}

package level3;

import java.util.Scanner;

public class level3_11021 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			System.out.println(
					"Case #" + i + ": " + (num1 + num2));
		}

	}
	
}

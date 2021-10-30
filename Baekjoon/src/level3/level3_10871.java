package level3;

import java.util.Scanner;

public class level3_10871 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		for (int i = 1; i <= num1; i++) {
			int arr = scan.nextInt();
			if (arr < num2) {
				System.out.println(arr);
			}
		}
	}
	
}

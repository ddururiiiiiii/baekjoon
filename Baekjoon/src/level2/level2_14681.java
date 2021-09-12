package level2;

import java.util.Scanner;

public class level2_14681 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		
		if(num1 < 0) {
			if(num2 > 0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
		} else {
			if (num2 > 0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		};
		
		
	}
}

package level3;

import java.util.Scanner;

public class level3_2739 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		int num = scanner.nextInt();
		
		for(int i = 1; i<= 9; i++) {
			System.out.println(num + " * " + i +" = " + i*num);
		}
		
	}
}

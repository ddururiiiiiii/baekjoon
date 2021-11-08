package level4;

import java.util.Scanner;

public class level4_1110 {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int temp = a;
		int count = 0;
		
		while(true) {
			int left = temp / 10;
			int right =  temp % 10;
			temp = right * 10 + (left + right) % 10;
			count++;
			if(a == temp) {
				break;
			}
		}
		System.out.println(count);
		
		
	}
}

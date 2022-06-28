package etc;

import java.util.Random;
import java.util.Scanner;

public class random {
	
	
	public static void main(String[] args) {
			//f
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		// 랜덤숫자 만들기 - random 객체, setseed 함수 이용
		// 범위  : 1 ~ 100
		Random randomNum1 = new Random();
		randomNum1.setSeed(System.currentTimeMillis());
		System.out.print(randomNum1.nextInt(100) + 1);
		
		// 랜덤숫자 만들기 - Math.random() 함수 이용
		// 범위 : 1 ~ 100
		int randomNum2 = (int)(Math.random() * 99 ) + 1;
		System.out.println(randomNum2);
		
		
	}
}

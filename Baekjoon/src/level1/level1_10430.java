package level1;

import java.util.Scanner;

public class level1_10430 {
	
//	첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
//	첫째 줄에 (A+B)%C, 
//	둘째 줄에 ((A%C) + (B%C))%C, 
//	셋째 줄에 (A×B)%C, 
//	넷째 줄에 ((A%C) × (B%C))%C를 출력한다.	
	
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();   
        int C = scan.nextInt();      

        System.out.println((A+B)%C);
        System.out.println((A%C + B%C)%C);
        System.out.println((A*B)%C);
        System.out.println((A%C * B%C)%C);
	
	}	

}


package practice01.prob3;

import java.util.Scanner;

public class Prob3 {
	public static void main (String args[]) {
	
		Scanner in = new Scanner(System.in);
		int x;
		int total = 0;
		System.out.print("숫자를 입력하세요 : ");
		x = in.nextInt();
		
		if(x%2 == 1) {
			for(int i = 0; i <= x; i++) {
				if(i%2 == 1)
					total = total + i;
			}
		}
		else {
			for(int i = 0; i <= x; i++){
				if(i%2 == 0)
					total = total + i;
			}
		}
		
		System.out.println("결과 값 : " + total);
		in.close();

	}
}

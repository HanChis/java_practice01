package practice01.prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
		int x;
		
		System.out.print("수를 입력하시오 : ");
		x = in.nextInt();
		
		if( x % 3 == 0 )
			System.out.println("3의 배수입니다.");
		
		in.close();

	}
}

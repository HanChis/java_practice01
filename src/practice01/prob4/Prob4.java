package practice01.prob4;

import java.util.Scanner;

public class Prob4 {
	public static void main (String args[]) {
	
		Scanner in = new Scanner(System.in);
		String x;
		
		System.out.print("문자열을 입력하세요. : ");
		x = in.nextLine();

		for(int i = 1; i < x.length(); i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(x.charAt(j));
			}
			System.out.println();
		}

		in.close();

	}
}

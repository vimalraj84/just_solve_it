package com.bilqu.solve.prob.math;

import java.util.Scanner;

public class NumberPalindrome {
	
	public static void main (String[] a) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		System.out.println(isPalindrome(input));
	}
	
	public static boolean isPalindrome(int ip) {

		int i = ip;
		System.out.println(ip);
		if (ip == 0 || ip< 0 || ip%10 == 0) {
			return false;
		}

		int reversed = 0;

		while(ip > 9){
			int pop = ip%10;
			ip /= 10;
			reversed = (reversed*10) + pop;
		}

		reversed = (reversed*10) + ip;

		System.out.println(i);
		System.out.println(reversed);
		if (reversed == i) {
			return true;
		}else {
			return false;
		}
	}
	
}

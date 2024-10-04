package com.impcodes;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		System.out.println("enter a year");
		Scanner sc = new Scanner(System.in);
		int y=sc.nextInt();
		if(y%400==0 && y%100==0 || y %100!=0&& y%4==0) {
			System.out.println("its leap year");
		}else {
			System.out.println("its not leap year");
		}
}
}
package com.impcodes;

import java.util.Scanner;

//123   321
public class ReverseTheNumber {
public static void main(String[] args) {
	int r;
	System.out.println("Enter a number ");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	while(n>0) {
		r=n%10;
		System.out.print(r);
		n=n/10;
	
	}
}
}

package com.impcodes;

import java.util.Scanner;

public class CountDigit {
public static void main(String[] args) {
	int Count=0;
	System.out.println("Enter a number ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	while(n>0) {
		n=n/10;
		Count++;
	}
	System.out.println("number of count is"+Count);
}
}

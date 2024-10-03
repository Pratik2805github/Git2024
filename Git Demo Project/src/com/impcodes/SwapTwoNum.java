package com.impcodes;

import java.util.Scanner;

public class SwapTwoNum {
public static void main(String[] args) {
	int temp;
	System.out.println("enter two a number");
	Scanner sc =new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("before swapping" +a +" "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping" +a +" "+b);
}
}

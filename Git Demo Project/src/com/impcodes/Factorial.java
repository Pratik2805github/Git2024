package com.impcodes;

import java.util.Scanner;

//factorial 5==5*4*3*2*1
public class Factorial {
public static void main(String[] args) {
	int Fact=1;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	for (int i = 1; i<=n; i++) {
    Fact=i*Fact;		
	}
	System.out.println("factorial is" +Fact);
	}

}

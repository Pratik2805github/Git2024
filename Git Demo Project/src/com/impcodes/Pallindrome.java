package com.impcodes;

import java.util.Scanner;

//121 in revers also same
public class Pallindrome {
public static void main(String[] args) {
	int r,s=0;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int c=n;
	while(n>0) {
		r=n%10;
		s=(s*10)+r;
		n=n/10;
				
	}
if(s==n) {
	System.out.println("number is pallindrome");
	
}else {
	System.out.println("number is not pallindrome");
}
	
}
}

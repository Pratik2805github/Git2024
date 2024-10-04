package com.impcodes;

import java.util.Scanner;

//armstrong num
//371
//3*3*3+7*7*7+1*1*1=371.........take a cubes of every digit
public class ArmstrongNum{
	public static void main(String[]args) {
		int r;
		int arm=0;
	System.out.println("enter a number");
	Scanner sc = new Scanner(System.in);
	int Num=sc.nextInt();
	int c=Num;
	while(Num>0) {
		r=Num%10;
		arm=r*r*r+arm;
		Num=Num/10;
	}
	if(arm==c) {
		System.out.print("num is armstrong ");
	}else {
		System.out.println("number is not armstrong");
	}
		}
}

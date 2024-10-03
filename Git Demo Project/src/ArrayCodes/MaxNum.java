package ArrayCodes;

import java.util.Scanner;

//max number in array 
public class MaxNum {
public static void main(String[] args) {
	int a[]=new int[4];
	System.out.println("enter a element");
	Scanner sc =new Scanner(System.in);
	for(int i=0;i<a.length;i++) {
         a[i]=sc.nextInt();
	}
	int max=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
	System.out.println("max vaule" +max);
}
}

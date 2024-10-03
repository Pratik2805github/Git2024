package ArrayCodes;

public class DuplicateElementInArray {
	public static void main(String[] args) {
		int Count=0;
		int a[]= {23,11,456,23,65,78,99,456,32,44,67,21,65,21,78,53,27,29,88,88,88,83,44};
		for(int i=0;i<a.length;i++) {
for(int j=i+1;j<a.length;j++){
	if (a[i]==a[j]) {
		System.out.print("  "+a[i]);
	}
}
		}
	}
}

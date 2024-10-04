package ArrayCodes;

public class ArrayAchiveSum {
	public static void main(String[] args) {
		int a[]= {1, 2, 3, 4, 5, 6, -1 };// 3+2=5,4+1=5,6-1=5
	int targetsum=5;
	int count=0;
	for(int i:a) {
		for(int j:a) {
			if(i+j==5) {
				count++;
			}
		}
	}
	count=count/2;
	System.out.println(count);
	}
}

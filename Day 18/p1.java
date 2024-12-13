import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :");
		int a = sc.nextInt();
		System.out.println("Enter num2 :");
		int b = sc.nextInt();

		System.out.println("Before Swap : a = "+a+" & b ="+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap : a = "+a+" & b ="+b);

	}
}
/*
Enter num1 :
10
Enter num2 :
20
Before Swap : a = 10 & b =20
After Swap : a = 20 & b =10
*/
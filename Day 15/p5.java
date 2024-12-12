import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System .out.println("Enter num1 :");
		int a = sc.nextInt();
		System .out.println("Enter num2 :");
		int b = sc.nextInt();
		System .out.println("Enter num3 :");
		int c = sc.nextInt();

		if(a>b && a>c){
			System.out.println("The Maximun no is :"+a);
		}else if(b>a && b>c){
			System.out.println("The Maximun no is :"+b);
		}else{
			System.out.println("The Maximun no is :"+c);
		}

	}
}
/*
Enter num1 :
56
Enter num2 :
7
Enter num3 :
99
The Maximun no is :99
*/
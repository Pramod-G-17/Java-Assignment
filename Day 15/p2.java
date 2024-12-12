import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();

		if(num1>num2){
			System.out.println(num2);
		}else{
			System.out.println(num1);
		}
	}
}
/*
Enter num1 :
56
Enter num2 :
99
56
*/
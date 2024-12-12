import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Distance :");
		int a = sc.nextInt();
		System.out.println("Enter the Time :");
		int b = sc.nextInt();

		int c = a/b;
		System.out.println("The velocity of a partical roaming in space is :"+c);
		
	}
}
/*
Enter the Distance :
100
Enter the Time :
20
The velocity of a partical roaming in space is :5
*/
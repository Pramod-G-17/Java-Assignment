import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :");
		int a =sc.nextInt();
		
		for(int i=10;i>=1;i--){
			System.out.println(a+"X"+i+"="+a*i);
		}
	}
}
/*
Enter num1 :
2
2X10=20
2X9=18
2X8=16
2X7=14
2X6=12
2X5=10
2X4=8
2X3=6
2X2=4
2X1=2
*/
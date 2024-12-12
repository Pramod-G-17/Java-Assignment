import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();
		int fact=1;
		
			for(int j=1 ;j<=num2; j++){
				fact*=j;
			System.out.println("Factriol of "+j+" is :"+fact);
			}
	}
}
/*
Enter num1 :
1
Enter num2 :
5
Factriol of 1 is :1
Factriol of 2 is :2
Factriol of 3 is :6
Factriol of 4 is :24
Factriol of 5 is :120
*/
import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length :");
		int l = sc.nextInt();
		System.out.println("Enter Bridth :");
		int b = sc.nextInt();

		if(l>=0 && b>=0){
			System.out.println("Area = "+l*b);
		}else{
			System.out.println("Enter valid det");
		}
	}
}
/*
Enter Length :
10
Enter Bridth :
20
Area = 200
*/
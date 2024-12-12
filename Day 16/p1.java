import java.util.*;

class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter num1 :");
		int num = sc.nextInt();
		for(int i=1 ; i<=num/2 ; i++){
			if(num%i==0);
			sum +=i;
		}
		if(num>0 && sum==num){
			System.out.println(num+" is a Perfect number");
		}else{
			System.out.println(num+" is a Not Perfect number");
		}
	}
}
/*
Enter num1 :
6
6 is a Perfect number
*/
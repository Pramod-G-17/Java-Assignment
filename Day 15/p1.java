import java.util.*;
class demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no a");
		int a = sc.nextInt();
		System.out.println("Enter no b");
		int b = sc.nextInt();

		for(int i=a;i<=b;i++){
			if(i%2==0){
				System.out.print(i);
			}else{
				System.out.print(" ");
			}
		}
	}
}
/*
Enter no a
4
Enter no b
60
4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60
*/
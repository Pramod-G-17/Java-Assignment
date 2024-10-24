  import java.util.*;

class pamu{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no1 :");
		int num1=sc.nextInt();
		System.out.println("Enter no2 :");
		int num2=sc.nextInt();
		System.out.println("Before Swap :"+num1+" "+num2);
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;

		System.out.println("After Swap :"+num1+" "+num2);
	}
}

/*
Enter no1 :
20
Enter no2 :
30
Before Swap :20 30
After Swap :30 20
*/
import java.util.*;

class pamu{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Min of Series :");
		int num1=sc.nextInt();
		System.out.println("Max of Series :");
		int num2=sc.nextInt();
		
		for(int i=num1;i<=num2;i++){
			if(i%2==1){
				System.out.print(i+" ");
			}else{
				System.out.print("");
			}
		}
	}
}

/*
Min of Series :
4
Max of Series :
60
5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59
*/
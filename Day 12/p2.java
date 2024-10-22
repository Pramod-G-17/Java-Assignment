import java.util.*;

class pamu{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number a");
		int a=sc.nextInt();
		System.out.println("Enter Number b");
		int b=sc.nextInt();
		codex key=new codex();
		key.multi(a,b);
		key.div(a,b);
	}
}
class codex{
	void multi(int a,int b){
		System.out.println("Multiplication is"+ a*b);
	}
	void div(int a,int b){
	if(b>a){
		System.out.println("Division is"+b/a);
		}else{
			System.out.println();
			}
	}
}
/*
Enter Number a
10
Enter Number b
20
Multiplication is200
Division is2
*/
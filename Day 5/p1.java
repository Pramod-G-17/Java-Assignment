class pamu{
	public static void main(String[]args){
		int a=20;
		int b=30;
		int c=40;
		if(a>=b && a>=c){
			  System.out.print(a);
		}else if(b>=a && b>=c){
			System.out.print(b);
		}else{
			System.out.print(c+" is the largest among all numbers");
		}
	}
}

O/P:-

40 is the largest among all numbers
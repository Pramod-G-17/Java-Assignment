class pamu{
	public static void main(String[]args){
		int a=5;
		int b;
		for(int i=a;i>=1;i--){
			b=i;
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
				a--;
			}
			System.out.println();
		}
	}
}
O/P:-

5 5 5 5 5
4 4 4 4
3 3 3
2 2
1
class pamu{
	public static void main(String[]args){
		char ch='A';
		for(int i=1;i<=4;i++){
		for(int j=1;j<=i;j++){
			System.out.print(ch+ " ");
			ch++;
		}
		System.out.println();
		}
	}
}
/*o/p:
A
B C
D E F
G H I J
*/
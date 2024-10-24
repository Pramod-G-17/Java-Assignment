class pamu{
	public static void main(String[]args){
		char ch='a';
		char ch1='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i%2==1 ? 'a':'A');
			}
					System.out.println();
		}
	}
}
/*
a
AA
aaa
AAAA
aaaaa
*/

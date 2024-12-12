class demo{
	public static void main(String[]args){
		int i=1;
		for(int a=1;a<=4;a++){
			for(int b=1;b<=a;b++){
				System.out.print((i*i)+" ");
				i++;
			}
		System.out.println(" ");
		}
	}
}
/*
1
4 9
16 25 36
49 64 81 100
*/
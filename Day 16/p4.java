class demo{
	public static void main(String[]args){
			int a=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j<=i){
					System.out.print(a*a*a+" ");
				a++;
				}else{
					System.out.print("  ");
				}
			}
		System.out.println(" ");
		}
	}
}
/*
1
8 27
64 125 216
343 512 729 1000
*/
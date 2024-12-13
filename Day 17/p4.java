class demo{
	public static void main(String[]args){
			int a = 3;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j<=i){
					System.out.print(a-i+j+" ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}
/*
3
2 3
1 2 3
0 1 2 3
*/
class pamu{
	public static void main(String[]args){
		for(int i=1;i<=4;i++){
			int a=4;
			for(int j=4;j>=1;j--){
				if(j<=i){
					System.out.print(a+" ");
				}else{
					System.out.print("  ");
				}
				a--;
			}
			System.out.println();
		}
	}
}

O/P:-

      1
    2 1
  3 2 1
4 3 2 1
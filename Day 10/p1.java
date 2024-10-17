class pamu{
	public static void main(String[]args){
		int a=7;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				if(j<=i){
					System.out.print(a+" ");
					a--;
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
			a+=1;
		}
	}
}

O/P:-
7
7 6
6 5 4
4 3 2 1
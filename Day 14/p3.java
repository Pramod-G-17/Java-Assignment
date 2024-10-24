class pamu{
	public static void main(String[]args){
		int a;
		for(a=1;a<=10;a++){
			if(a%2==0){
				System.out.println("Cube of "+a+" : "+a*a*a+" and Square of "+a+" : "+a*a);
			}else{
				System.out.print("");
			}
		}
	}
}

/*
Cube of 2 : 8 and Square of 2 : 4
Cube of 4 : 64 and Square of 4 : 16
Cube of 6 : 216 and Square of 6 : 36
Cube of 8 : 512 and Square of 8 : 64
Cube of 10 : 1000 and Square of 10 : 100
*/
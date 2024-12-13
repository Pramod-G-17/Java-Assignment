import java.util.Scanner;
class demo{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
			System.out.print("Enter the Number of Elements in the arrya:");
				int n= scanner.nextInt();
					int[] arr =new int[n];
						System.out.println("Enter " + n + "elements for the array:");
							for(int i=0; i<n; i++){
								arr[i] = scanner.nextInt();
							} 
							System.out.print("Odd  Elements");

						for(int i = 0; i<n;i++){
							if(arr[i] %2 != 0){
								System.out.print(arr[i] + " ");
							}
						}
						System.out.println();

					System.out.print("Even Elements:");

				for(int i=0;i<n;i++){
					if(arr[i] %2 == 0){
						System.out.print(arr[i] + " ");
					}
				}
				scanner.close();
			}
	}
/*
Enter the Number of Elements in the arrya:6
Enter 6elements for the array:
1
2
3
4
5
6
Odd  Elements1 3 5
Even Elements:2 4 6
*/
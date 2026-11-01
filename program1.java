//Q1

import java.util.*;

class demo{
	
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter no of Rows: ");

	int num1 = sc.nextInt();

	int num2 = 2;

	for(int i=1; i <= num1; i++){

		num2--;
	
		for(int j=1; j <= num1; j++){
	
		System.out.print(num2 +" ");	

		num2++;
		}

	System.out.println();	
      	}
	}
}

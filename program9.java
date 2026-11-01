//Q9

import java.util.*;

class demo{

        public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");

        int rows = sc.nextInt();

	

        for(int i = 1; i <= rows; i++){

		char ch ='A';

        if(i % 2 != 0){
	
		for(int j=1; j <= rows; j++){
		
			System.out.print(j +""+ ch +" ");
		ch++;
		}
	
	}else{
	
		for(int j = rows; j>=1 ; j--){
		
			System.out.print(j +""+ (char)(ch + rows -1) +" ");
		
		ch--;
		}

	}       


        System.out.println();
        }
        }
}

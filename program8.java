//Q8

import java.util.*;

class demo{

        public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");

        int rows = sc.nextInt();

	int val = 1;

        for(int i = 1; i <= rows; i++){


                for(int j = 1; j <= rows; j++){

                if(j % 2 != 0){
		System.out.print(val*val +" ");
		
		}else{
		
		System.out.print(val +" ");

		}

		val++;
                }


        System.out.println();
        }
        }
}

//Q4

import java.util.*;

class demo{

        public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");

        int rows = sc.nextInt();

	

        for(int i=1; i <= rows; i++){

		int count = i;
                for(int j=1; j <= rows; j++){

                System.out.print(count + " ");

                count++;
                }
		

        System.out.println();
        }
        }
}


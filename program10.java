//Q10

import java.util.*;

class demo{

        public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");

        int rows = sc.nextInt();

        String[] symbols = {"#","$","@"};

	        for(int i = 0; i < rows; i++){

			String symbol = symbols[i%symbols.length];
			for(int j=1; j<=rows; j++){
			
			System.out.print(symbol + "\t");
			
			}
               
		System.out.println();
        
		}
        }
}


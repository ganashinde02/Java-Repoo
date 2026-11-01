//Q1

import java.util.*;

class demo{

        public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");

        int rows = sc.nextInt();

        int count = 1;

        for(int i=1; i <= rows; i++){

                for(int j=1; j <= rows; j++){

                System.out.print((count * count) + "\t");

                count++;
                }

        System.out.println();
        }
        }
}


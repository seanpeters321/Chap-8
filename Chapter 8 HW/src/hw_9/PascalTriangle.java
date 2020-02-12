package hw_9;

import java.util.Scanner;

public class PascalTriangle {
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	       int row;
	       
	       
	       System.out.println("Enter the number of lines of Pascel's Triangle to print: ");
	       row = scan.nextInt();
	       
	       
	       for (int i = 0; i < row; i++) 
	        { 
	            for (int j = row - i; j > 1; j--) 
	            { 
	                System.out.print(" "); 
	            } 
	            for (int j = 0; j <= i; j++ ) 
	            { 
	                System.out.print(pascal(i,j) + " ");
	                //System.out.print("t ");
	            } 
	            System.out.println(); 
	        }
	   }

   public static int pascal(int i, int j) {
       if (j == 0) {
           return 1;
       } else if (j == i) {
           return 1;
       } else {
           return pascal(i - 1, j - 1) + pascal(i - 1, j);
       }

   }

   
}
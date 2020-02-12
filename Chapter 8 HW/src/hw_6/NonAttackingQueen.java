package hw_6;

import java.util.Scanner;

public class NonAttackingQueen{
	static int [][] board = new int [8][8];
	
	public static void main(String[] args) {
		print();
		System.out.println("\n\nSolved Board\n----------------");
		print(8);
	}
	
	
	
	public static void solve(int row, int []board) {
	if(row == 8)
		
}
	
	
	
	public static void print() {
		int [][] b = new int [8][8];
		
		for (int [] n: b) {
			for(int w: n)
				System.out.print(w + " ");
			System.out.println();
		}
		
	}
	
	public static void print(int num) {
		for (int [] n: board) {
			for(int w: n)
				System.out.print(w + " ");
			System.out.println();
		}
	}
	
}

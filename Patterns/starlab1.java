/*
****
****
****
**** 
*/

package practice;

import java.util.Scanner;

public class starlab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Pls Enter Row num?");
		int i=sc.nextInt(); 
		
		System.out.println("Pls Enter Column num?");
		int j=sc.nextInt(); 
		
		for(int p=0; p<i; p++) {
			for(int q=0; q<j; q++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		
		

	}

}


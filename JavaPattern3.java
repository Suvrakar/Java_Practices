/*
    * 
   ** 
  *** 
 ****  
*/
package practice;

import java.util.Scanner;

public class starlab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Pls Enter num?");
		int i=sc.nextInt(); 
		
		for(int p=1; p<=i; p++) {
			for(int o=1; o<=i-p; o++) {
			
			System.out.print(" ");
			}
			for(int q=0; q<p; q++) {
			
			System.out.print("*");
			}
			System.out.println("");
		}
	
	}

}

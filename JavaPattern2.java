/*
*
**
***
**** https://github.com/Suvrakar/java_Patterns/blob/master/starlab2.java
*/

package practice;

import java.util.Scanner;

public class starlab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Pls Enter num?");
		int i=sc.nextInt(); 
		
		for(int p=1; p<=i; p++) {
			for(int o=1; o<=p; o++) {
			
			System.out.print("*");
			}
			
			System.out.println();
		}
	
		
	}

}

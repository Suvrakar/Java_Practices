/*
 
*****
****
***
**
*

*/


package practice;

import java.util.Scanner;

public class starlab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Pls Enter num?");
		int i=sc.nextInt(); 
		
		for(int p=i; p>0; p--) {
			for(int o=0; o<=p-o; o++) {
			
			System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
	}

}

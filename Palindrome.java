package arrayprbs;

//import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc=new Scanner(System.in);
		
		int a=124;
		
		int newnum=0;
		
		for(;a!= 0;) {
			int p=a%10;
			newnum=newnum*10+p;
			a=a/10;
			}
		System.out.println(newnum+" ");
		
		if(a==newnum) {
			System.out.println("Palimdrome");
		}
		else {
			System.out.println("Not Palimdrome");
		}
		
	}

}

package arrayprbs;

import java.util.Arrays; 

public class arraytwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {2,4,6,7,8};
		int b[]= {10,24,16,17,28};
		
		int alen=a.length;
		int blen=b.length;
		
		int newarr[]=new int[alen+blen];
		
		System.arraycopy(a, 0, newarr, 0, alen);
		System.arraycopy(b, 0, newarr, alen, blen);
		
		System.out.println(Arrays.toString(newarr));
		
		Arrays.sort(newarr);
		
		for(int i=0; i<newarr.length; i++) {
			
		
		System.out.print(newarr[i]+", ");
		
		}
	}

}

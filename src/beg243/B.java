package beg243;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc1.nextLong();
		}
		for(int i=0;i<n;i++) {
			b[i]=sc1.nextLong();
		}
		
		long count1=0;
		long count2=0;

		
		for(int i=0;i<n;i++) {
			if(a[i]==b[i])count1++;
			for(int j=0;j<n;j++) {
				
				if(a[i]==b[j])count2++;
			}
		}
		
		System.out.println(count1);
		System.out.println(count2-count1);
		

	}

}

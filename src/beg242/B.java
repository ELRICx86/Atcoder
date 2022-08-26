package beg242;

import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		String str=sc1.next();
		int[] freq=new int[26];
		for(int i=0;i<str.length();i++) {
			freq[str.charAt(i)-97]++;
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>0) {
				char c=((char)(i+97));
				String sr= Character.toString(c);
				sb.append(sr.repeat(freq[i]));
			}
		}
		
		System.out.println(sb.toString());
		
		
		

	}

}

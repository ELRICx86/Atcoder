package beg250;

import java.sql.Struct;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		int n,a,b;
		n=inp.nextInt();
		a=inp.nextInt();
		b=inp.nextInt();
		String s1="";
		String s2="";
		char c1='.';
		char c2='#';
		
		String ss="";
		String sr="";
		
		
		for(int i=0;i<b;i++) {
			s1+=c1;
			s2+=c2;
		}
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				ss+=s1;
				sr+=s2;
			}
			else {
				ss+=s2;
				sr+=s1;
			}
		}
		
		
		for(int i=0;i<n;i++) {
			
			if(i%2==0) {
			for(int j=0;j<a;j++) {
				System.out.println(ss);
			}}
			else {
				for(int j=0;j<a;j++) {
					System.out.println(sr);
				}
				
			}
		}
		

	}

}

package beg240;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		 Set<Long> set=new HashSet<>();
		while(n-->0) {
		Long x=sc1.nextLong();
		set.add(x);
		 
		}
		System.out.println(set.size());

	}

}

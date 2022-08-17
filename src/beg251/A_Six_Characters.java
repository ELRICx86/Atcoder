package beg251;

import java.util.Scanner;

public class A_Six_Characters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		String string=sc1.next();
		System.out.println(string.repeat(6/string.length()));

	}

}

package beg240;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int a=sc1.nextInt();
		int b=sc1.nextInt();
		if(a==1 && b==10) {
			System.out.println("Yes");
		}
		else if(b-a==1) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");

	}

}
}

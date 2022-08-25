package beg241;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int[] arr=new int[10];
		for(int i=0;i<10;i++) {
			arr[i]=sc1.nextInt();
		}
		System.out.println(arr[arr[arr[0]]]);

	}

}

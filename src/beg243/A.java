package beg243;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int arr[]=new int[3];
		int v=sc1.nextInt();
		for(int i=0;i<3;i++) {
			arr[i]=sc1.nextInt();
		}
		int i=0;
		while(true) {
			if(i>=3)i=0;
			v-=arr[i];
			if(v<0)break;
			i++;
		}
		
		if(i==0)System.out.println("F");
		else if(i==1) System.out.println("M");
		else System.out.println("T");
			
	

	}

}

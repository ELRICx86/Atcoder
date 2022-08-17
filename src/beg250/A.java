package beg250;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp=new Scanner(System.in);
		int h,w,r,c;
		h=inp.nextInt();
		w=inp.nextInt();
		r=inp.nextInt();
		c=inp.nextInt();
		int x=0;
		int y=0;
		
		int count=0;
		for(int i=1;i<=h;i++) {
			for(int j=1;j<=w;j++) {
				if(Math.abs(r-i)+Math.abs(j-c)==1)
					count++;
			}
		}
		
		System.out.println(count);
		
		
		
		
//		if(r>h-1 && r>h+1)x=2;
//		else if(y==1) x=0;
//		else x=1;
//		
//		
//		if(c>w-1 && c>w+1)y=2;
//		else if(x==1) y=0;
//		else y=1;
//		
//		System.out.println(x+y);

	}

}

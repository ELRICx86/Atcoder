package beg240;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class C {
	
	public static int func(int ind,int sum,ArrayList<Integer> sub,int N,int r) {
		int flag=0;
		if(ind==N) {
			return flag;
		}
		func(ind+1, sum+=sub.get(ind), sub, N,r);
		func(ind+1, sum, sub, N,r);
		
		if(sum==r)
			flag=1;
		
		return flag;

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int x=sc1.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int sub[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++) {
			arr1[i]=sc1.nextInt();
			arr2[i]=sc1.nextInt();
			sum+=arr1[i];
			sub[i]=arr2[i]-arr1[i];
		}
		int r=x-sum;
		ArrayList<Integer> sub1=new ArrayList<>();
		Arrays.sort(sub);
		int rt=0;
		for(int i=0;i<n;i++) {
			if(sub[i]>r)break;
			rt+=sub[i];
			sub1.add(rt);
			
		}
		
		for(int i=0;i<n;i++) {
			if(sub[i]>r) {
				break;
			}
			sub1.add(sub[i]);
		}
		
		if(sum>x)System.out.println("No");
		else if(sum==x)System.out.println("Yes");
		else {
			int flag=0;
			flag= func(0, 0, sub1, sub1.size(), r);
			
			//if(sum+sub1.get(0)==x)System.out.println("Yes");
			//else {
//				for(int i=sub1.size()-1;i>=0;i--) {
//					for(int j=0;j<i;j++) {
//						if(sub1.get(i)-sub1.get(j)==r) {
//							flag=1;
//						}
//						
//					}
//				}
			
			
			
				
				if(flag==1)System.out.println("Yes");
				else System.out.println("No");
			}
		//}
		

	}

}

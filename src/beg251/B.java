package beg251;

import java.util.Arrays;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int t=sc1.nextInt();
		int arr[]=new int[n];
		int w[] =new int[t+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc1.nextInt();
		}
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]<=t) {
				w[arr[i]]=1;
			}
		}
		
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]<=t) {
						w[arr[i]+arr[j]+arr[k]]=1;
					}
				}
			}
		}
		
	
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]<=t)w[arr[i]+arr[j]]=1;
			}
		}
		int count=0;
		for(int i=0;i<w.length;i++) {
			if(w[i]==1)count++;
		}
		
		
		
		System.out.println(count);
		
		

	}

}

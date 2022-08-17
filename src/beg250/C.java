package beg250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class C {
	
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }

	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader inp=new FastReader();
		int n,a,b;
		n=inp.nextInt();
		a=inp.nextInt();
		int arr[]=new int[n+1];
		int op[]=new int[a];
		
		for(int i=1;i<=n;i++)arr[i]=i;
		for(int i=0;i<a;i++)op[i]=inp.nextInt();
		
		for(int i=0;i<a;i++) {
			int x=op[i];
			int temp=0;
			
			for(int j=1;j<=n;j++) {
				if(arr[j]==op[i])
					x=j;
			}
			if(x<n) {
				temp=arr[x+1];
				arr[x+1]=arr[x];
				arr[x]=temp;
			}
			if(x==n) {
				temp=arr[x-1];
				arr[x-1]=arr[x];
				arr[x]=temp;
				
			}
		}
		
		
		for(int i=1;i<=n;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}

}

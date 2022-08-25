package beg241;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Scanner sc1=new Scanner(System.in);
		
		int n=sc1.nextInt();
		List<String> ss=new ArrayList<>();
		for(int i=0;i<n;i++) {
			ss.add(sc1.next());
		}
		boolean flag=false;
		
		String str="";
		
		for(int k=0;k<n;k++) {
			str=ss.get(k);
			
			
			
			
			String str2="";
			List<Integer> list=new ArrayList<>();
			
			//for horizontal
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)== '.')list.add(i);
			}

			if(list.isEmpty())flag=true;
			
			else {
			
			for(int i=0;i<list.size()-1;i++) {
				StringBuilder myName = new StringBuilder(str);
				myName.setCharAt(list.get(i), '#');
				myName.setCharAt(list.get(i+1), '#');
				
				str2=myName.toString();
				if(str2.contains("######"))
					{
					flag=true;
					break;
					}
			}
			
			}
		}
		
		
		
		
		//for vertical
		
		
		for(int k=0;k<n;k++) {
			
			for(int j=0;j<n;j++) {
				str+=ss.get(j).charAt(k);
			}
			String str2="";
			List<Integer> list=new ArrayList<>();
			
			//for horizontal
			
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)== '.')list.add(i);
			}

			if(list.isEmpty())flag=true;
			
			else {
			
			for(int i=0;i<list.size()-1;i++) {
				StringBuilder myName = new StringBuilder(str);
				myName.setCharAt(list.get(i), '#');
				myName.setCharAt(list.get(i+1), '#');
				
				str2=myName.toString();
				if(str2.contains("######"))
					{
					flag=true;
					break;
					}
			}
			
			}
		}
		
		
		
		//for diagonal
		
		
		
		
		
		
		
		if(flag==true)System.out.println("Yes");
		else System.out.println("No");
		
		

	}

}

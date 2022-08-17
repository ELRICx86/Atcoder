package beg251;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		HashMap<String, Long> map=new HashMap<>();
		
		ArrayList<String> str=new ArrayList<>();
		Set<String> set=new HashSet<>();
		while(n-->0) {
			
			String string=sc1.next();
			long t=sc1.nextLong();
			if(!map.containsKey(string)){
				map.put(string, t);
			}
			str.add(string);
			
			
			
		}
		long best=0;
		String string="";
		
		for(String s: map.keySet()) {
			
			if(map.get(s)>best) {
				best=map.get(s);
				string=s;
			}
			
		}
		
		for(String s:map.keySet()) {
			if(map.get(s)==best) {
				set.add(s);
			}
		}
		
		//System.out.println(string);
		
		int ans =0;
		for(int i=0;i<str.size();i++) {
			ans++;
			if(set.contains(str.get(i))) {
				break;
			}
		}
		
		
		System.out.println(ans);
			
			
			
			
			
		

	}

}

package beg241;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		
		List<Long> plan=new ArrayList<>();
		
		HashMap<Long, Long> map=new HashMap<>();
		
		
		
		
		
		int n=sc1.nextInt();
		int m=sc1.nextInt();
		
		for(int i=0;i<n;i++) {
			long x=sc1.nextLong();
			long count =  (map.containsKey(x) ? map.get(x) : 0);
			map.put(x, count+1);

		}
		
		for(int i=0;i<m;i++) {
			plan.add(sc1.nextLong());
		}
		
		boolean flag=false;
		
		for(int i=0;i<m;i++) {
			if(map.containsKey(plan.get(i)) && map.get(plan.get(i))>=1) {
				map.put(plan.get(i), map.get(plan.get(i))-1);
			}
			else {
				flag=true;
			}
		}
		
		if(flag==false)System.out.println("Yes");
		else System.out.println("No");
		
		
		
		

	}

}

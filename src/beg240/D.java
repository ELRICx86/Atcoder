package beg240;
import java.util.Scanner;
import java.util.Stack;

public class D {
	
	public static class ball{
		int x;
		int y;
		public ball(int x,int y) {
			this.x=x;
			this.y=y;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<ball> st=new Stack<>();
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		int ans=0;
		for(int i=0;i<n;i++) {
			int x=sc1.nextInt();
			ans++;
			ball c=new ball(0, 0);
			
			if(!st.isEmpty()) {
				c=st.peek();
			}
			
			
			if(st.size()>0 && st.peek().x==x) {
				st.pop();
				c.y++;
				st.push(c);
				if(st.peek().y==x) {
					st.pop();
					ans-=x;
				}
				
			}
			else {
				st.push(new ball(x, 1));
			}

			System.out.println(ans);
			
			
		}
		

	}

}

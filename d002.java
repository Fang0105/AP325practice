package tcircjudge;

import java.util.*;
public class d002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String>st = new Stack<String>();
		Stack<Integer>num = new Stack<Integer>();
		while(scan.hasNext()) {
			st.push(scan.next());
		}
		while(st.empty()==false) {
			
			if(st.peek().equals("f")==false&&st.peek().equals("g")==false&&st.peek().equals("h")==false) {
				num.push(Integer.parseInt(st.peek()));
			}else if(st.peek().equals("f")) {
				int x = num.peek();
				num.pop();
				num.push(2*x-3);
			}else if(st.peek().equals("g")){
				int x = num.peek();
				num.pop();
				int y = num.peek();
				num.pop();
				num.push(2*x+y-7);
			}else {
				int x = num.peek();
				num.pop();
				int y = num.peek();
				num.pop();
				int z = num.peek();
				num.pop();
				num.push(3*x-2*y+z);
			}
			st.pop();
		}
		
		System.out.println(num.peek());

	}

}
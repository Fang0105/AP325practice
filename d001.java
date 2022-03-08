package tcircjudge;
import java.util.*;
public class d001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String>st = new Stack<String>();
		Stack<Integer>num = new Stack<Integer>();
		while(scan.hasNext()) {
			st.push(scan.next());
		}
		while(st.empty()==false) {
			
			if(st.peek().equals("f")==false&&st.peek().equals("g")==false) {
				num.push(Integer.parseInt(st.peek()));
			}else if(st.peek().equals("f")) {
				int x = num.peek();
				num.pop();
				num.push(2*x-1);
			}else {
				int x = num.peek();
				num.pop();
				int y = num.peek();
				num.pop();
				num.push(x+2*y-3);
			}
			st.pop();
		}
		
		System.out.println(num.peek());

	}

}
package tcircjudge;
import java.util.*;
public class d042 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {50,10,5,1};
		int n = scan.nextInt();
		for(int i=0;i<n;i++) {
			int k = scan.nextInt();
			int tot = 0;
			for(int j:arr) {
				tot += (k/j);
				k%=j;
			}
			System.out.println(tot);
		}

	}

}
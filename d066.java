package tcircjudge;

import java.util.*;

public class d066 {
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] stair = new int[n];
		int[] dp = new int[n];
		for(int i=0;i<n;i++) {
			stair[i] = scan.nextInt();
			if(i==0||i==1) {
				dp[i] = stair[i];
			}else {
				dp[i] = Math.min(dp[i-1],dp[i-2])+stair[i];
			}
		}
		System.out.println(dp[n-1]);
		

	}
	
	
	
	

}
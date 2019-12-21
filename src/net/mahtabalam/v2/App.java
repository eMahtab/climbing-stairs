package net.mahtabalam.v2;

public class App {
	
	public static void main(String[] args) {
		System.out.println("Total ways to climb 3 stairs: "+climbStairs(3));
	}
	
	// Runtime = O(n) , Space = O(1)
	private static  int climbStairs(int n) {
		int oneStairBefore = 1;
        int twoStairsBefore = 1;
        int nthStair = 1;
        for(int i = 2; i <= n; i++){
            nthStair = oneStairBefore +  twoStairsBefore;
            oneStairBefore = twoStairsBefore;
            twoStairsBefore = nthStair;
        }
        return nthStair;
    }
}

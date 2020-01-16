# Climbing Stairs

You are climbing a stair case. It takes n steps to reach to the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Note: Given n will be a positive integer.

```

Example 1:

Input: 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps


Example 2:

Input: 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```
### Implementation :

#### Dynamic Programming
```java
public class App {
	
	public static void main(String[] args) {
		System.out.println("Total ways to climb 3 stairs: "+climbStairs(3));
	}
	
	// Runtime = O(n) , Space = O(n)
	private static  int climbStairs(int n) {
         int[] dpTable = new int[n+1];
         dpTable[0] = 1;
         dpTable[1] = 1;
         for(int i = 2; i <= n; i++){
             dpTable[i] = dpTable[i-1] + dpTable[i-2];
         }
         return dpTable[n];
      }
}

```

The above implementation have both runtime and space complexity of O(n)
```
Runtime Complexity = O(n)
Space Complexity   = O(n)
```

#### Dynamic Programming - Space Optimization O(1)
```java
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
            twoStairsBefore =  oneStairBefore;
            oneStairBefore = nthStair;
         }
        return nthStair;
    }
}
```

The above implementation have runtime complexity of O(n) and space complexity of O(1)
```
Runtime Complexity = O(n)
Space Complexity   = O(1)
```

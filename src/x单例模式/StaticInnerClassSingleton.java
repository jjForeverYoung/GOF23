package x单例模式;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){}

    private static class InnerClass{
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }


}

class Solution {
    public int coinChange(int[] coins, int amount) {
        int [] dp = new int[amount + 1];
        dp[0] = 0;

        for(int i = 1; i <= amount; i++){
            int cost = Integer.MAX_VALUE;
            for(int j = 0; j < coins.length; j++){
                if(i - coins[j] >= 0){
                    if(dp[i - coins[j]] != Integer.MAX_VALUE){
                        cost = Math.min(cost,dp[i - coins[j]] + 1);
                    }
                }
            }
            dp[i] = cost;
        }
        return dp[amount] ==Integer.MAX_VALUE ? -1 : dp[amount];
    }
}

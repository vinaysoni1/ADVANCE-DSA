import java.util.Arrays;
public class recursionfn {
    static int minSteps(int n, int[] dp) {
        if(n<=2)
            return n;
        if(dp[n] != -1)
            return dp[n];
        dp[n]=minSteps(n-1, dp) + (n-1)* minSteps(n, dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(minSteps(n, dp));
    }
}

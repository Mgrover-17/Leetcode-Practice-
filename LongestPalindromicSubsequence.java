class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
          String rev = helper(S);
        int m = rev.length();
        int dp[][] = new int[m+1][m+1];
        
        for(int i = 0; i<=m; i++)
            for(int j = 0; j<=m; j++){
                if(i == 0)
                    dp[i][j] = 0;
                else if(j == 0)
                    dp[i][j] = 0;
                else if(S.charAt(i-1) == rev.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]); 
            }
        
        return dp[rev.length()][rev.length()];
    }
    
    public static String helper(String s){
        String rev = "";
        
        for(int i = s.length()-1; i>=0; i--)
            rev += s.charAt(i);
            
        return rev;
    }
}
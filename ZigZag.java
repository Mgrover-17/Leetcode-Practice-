class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)   
         return s;

        String ans = "";
        int step = 2 * numRows - 2;
        for(int i = 0; i < numRows; i++)
        {
            for(int j = i; j < s.length(); j += step)
            {
                ans += s.charAt(j);
                if(i >= 1 && i <= numRows - 2 && j + (step - 2 * i) < s.length())
                {
                    ans += s.charAt(j + step - 2 * i);
                }
            }
        }
        return ans;
    }
}
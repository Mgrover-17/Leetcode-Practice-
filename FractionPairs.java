import java.util.*;

class Solution {
    public static int countFractions(int n, int[] numerator, int[] denominator) {
        // code here
        Map<String, Integer> map = new HashMap<>();
        
        int count = 0;
        for(int i = 0; i < n; i++){
            int gcd = gcd(numerator[i], denominator[i]);
            int num = numerator[i]/gcd;
            int den = denominator[i]/gcd;
            if(num >= den) continue;
            String key = (den-num)+"/"+den;
            if(map.get(key) != null) count+= map.get(key);
            key = num+"/"+den;
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        return count;
    }
    private static int gcd(int a, int b){
        if(a == 0) return b;
        return gcd(b%a, a);
    }
}
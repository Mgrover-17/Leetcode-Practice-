import java.util.ArrayList;
import java.util.Collections;

class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        // code here
        ArrayList<Integer> piles = new ArrayList<>();
    for (int num : a) {
        int pileIdx = Collections.binarySearch(piles, num);
        if (pileIdx < 0) {
            pileIdx = -(pileIdx + 1);
            if (pileIdx == piles.size()) {
                piles.add(num);
            } else {
                piles.set(pileIdx, num);
            }
        }
    }
    return piles.size();
    }
} 
import java.util.ArrayList;
import java.util.List;

public class Permutations {
    List<List<Integer>> ans = new ArrayList<>();

    void solve(int[] nums, int[] per, int c) {
        if (c == nums.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : per) {
                permutation.add(num);
            }
            ans.add(permutation);
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (per[i] == 11) {
                per[i] = nums[c];
                solve(nums, per, c + 1);
                per[i] = 11;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        int[] per = new int[n];
        for (int i = 0; i < n; i++) {
            per[i] = 11;
        }
        solve(nums, per, 0);
        return ans;
    }
} {
    
}

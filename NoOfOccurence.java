class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                c++;
            }
        }
        return c;
    }
}
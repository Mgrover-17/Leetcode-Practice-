class Solution {
    public int[] countBits(int n) {
        int[] arr = new int[n+1];
        arr[0] = 0;
      for(int i =1;i<=n;i++){
            int temp = i;
            int count = 0 ;
            while(temp != 0){ 
                temp = temp & (temp-1);
                count++;
            }
            arr[i] = count;
        }
        

        return arr;
    }
}

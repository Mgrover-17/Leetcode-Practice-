class Solution {
    public int trap(int[] height) {
        int right[]=new int[height.length];
        int left[]=new int[height.length];
        int right1=0;
        int left1=0;
        int count=0;
        for(int i=0;i<height.length;i++){
            right[i]=Math.max(height[i],right1);
            right1=right[i];
        }
        for(int i=0;i<right.length;i++){
            System.out.print(right[i]+" ");
        }
        System.out.println();
        for(int i=height.length-1;i>=0;i--){
            left[i]=Math.max(height[i],left1);
            left1=left[i];
        }
        for(int i=0;i<left.length;i++){
            System.out.print(left[i]+" ");
        }
        for(int i=0;i<right.length;i++){
            count+=Math.min(left[i],right[i])-height[i];
        }
        return count;
    }
}
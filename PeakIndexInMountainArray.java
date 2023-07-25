class Solution {
	 public int peakIndexInMountainArray(int[] arr) {
		int i = arr.length / 2;
		int arrLen = i;
		while (true) {
			if (arr[i]>arr[i+1]&&arr[i]>arr[i-1])break;
			if (arr[i]<arr[i+1]){
				arrLen /= 2;
				i+=arrLen;
			}
			else {
				i-=arrLen/2;
			}
		}
		return i;
	}
}
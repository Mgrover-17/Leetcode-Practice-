class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                int s=-(arr[i]+arr[j]);
                if(set.contains(s)){
                    return true;
                }
        }
        set.add(arr[i]);
        
        }
    return false;
    }
}
Problems
Courses
Jobs
Events
Upcoming
POTD

Refresh

Time (IST)	Status	Lang	Test Cases	Code
2023-08-19 00:14:33	Correct	java	1128 / 1128	View
Java (1.8)
Average Time: 20m




Custom Input
fab


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int k) 
    {
        // Your code here
         ArrayList<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        int sum = 0;
        while(j<n){
            sum+=arr[j];
            if(sum<k){
                j++;
            } else{
            while(sum >k&& i<j){
                sum-=arr[i];
                i++;
        
            }
            if(sum==k){
                res.add(i+1);
                res.add(j+1);
                break;
            }
            j++;
            }
        }
        if(res.isEmpty()){
            res.add(-1);
        }
        return res;
    }
}
class Solution
{
    /*You are required to complete this method*/
    int findK(int a[][], int n, int m, int k)
    {
	// Your code here	
        int colst=0;
        int colend=m-1;
        int rowst=0;
        int rowend=n-1;
        while(rowst<=rowend && colst<=colend){
            for(int i=colst;i<=colend;i++){
                k--;
                if(k==0) 
                return a[rowst][i];
            }
            rowst++;
            for(int i=rowst;i<=rowend;i++){
                k--;
                if(k==0) 
                return a[i][colend];
            }
            colend--;
            for(int i=colend;i>=colst;i--){
                k--;
                if(k==0) 
                return a[rowend][i];
            }
            rowend--;
            for(int i=rowend;i>=rowst;i--){
                k--;
                if(k==0) 
                return a[i][colst];
            }
            colst++;
        }
        return -1;
    }
}
public static int LargButMinFreq(int arr[], int n) {
        // Your code here
        HashMap<Integer,Integer>m=new HashMap<>();
        for(int i=0;i<n;i++){
            m.put(arr[i],m.get(arr[i])+1);
        }
        int minFrequency=Integer.MAX_VALUE;
        int maxElement=Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer>e:m.entrySet()){
            int num=e.getKey();
            int freq=e.getValue();
            if(freq<minFrequency){
                minFrequency=freq;
                maxElement=num;
            }
            else if(freq==minFrequency && num>maxElement){
                maxElement=num;
            }
        }
        return maxElement;
    }
}
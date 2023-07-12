class Solution {
    public int romanToInt(String s) {
        
        Map<Character,Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        
        char arr[] = s.toCharArray();
        int previous = 0;
        int result = 0;
        int n = arr.length;

        for(int i=n-1; i>=0; i--){
            int current = map.get(arr[i]);
            if(previous > current){
                result -= current;
            }else{
                result += current;
            }
            previous = current;
        }

        return result;
    }
}

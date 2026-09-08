class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.get(ch) > 2){
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, (right - left + 1));
        }
        return maxLength;
    }
}
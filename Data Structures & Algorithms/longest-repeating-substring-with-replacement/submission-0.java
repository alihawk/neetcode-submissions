class Solution {
    public int characterReplacement(String s, int k) {
        
        int left = 0;
        int [] count = new int[26];
        int maxFreq = 0;
        int answer = 0;

        for(int right =0; right<s.length();right++){
            char c = s.charAt(right);

            count[c-'A']++;
            maxFreq = Math.max(maxFreq, count[c-'A']);
            int windowLength = right - left + 1;
            while(windowLength - maxFreq > k){
                char leftChar = s.charAt(left);
                count[leftChar - 'A']--;
                left++;
                windowLength =right-left+1;
            }
            answer = Math.max(answer,right - left +1);


        }
        return answer;
    }
}

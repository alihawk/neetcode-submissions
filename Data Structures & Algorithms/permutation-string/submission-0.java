class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] s1Count = new int[26];
        int[] windowCount = new int[26];
        int windowLength = s1.length();
        int left = 0;

        char c;
        for (int i = 0 ;i<s1.length(); i ++){
            c =s1.charAt(i);
            s1Count[c - 'a']++;
            System.out.println(c);
            System.out.println(s1Count[c-'a']);
        }
        for(int right =0; right<s2.length(); right ++){
            c=s2.charAt(right);
            windowCount[c - 'a']++;

            if (right - left + 1 > windowLength) {
                char leftChar = s2.charAt(left);

                windowCount[leftChar - 'a']--;

                left ++;
            }

            if (Arrays.equals(s1Count, windowCount)) {
                    return true;
                }
            

        }
        
      return false;
    }
}

class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String words:strs){
            String encodedPart = words.length() + "#" + words;
            sb.append(encodedPart);

        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<str.length()){
            j = i;
            while(str.charAt(j) != '#'){
                j++;
        }
        String lenStr = str.substring(i,j);
        int len = Integer.parseInt(lenStr);
        int start = j+1;
        String word = str.substring(start, start+len);
        result.add(word);
        i = start + len;
        }
        return result;
    }
}

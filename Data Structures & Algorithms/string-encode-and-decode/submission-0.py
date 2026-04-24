class Solution:

    def encode(self, strs: List[str]) -> str:
        finalStr=[]
        for word in strs:
            finalStr.append(str(len(word))+ "#" + word)
        return "".join(finalStr)




    def decode(self, s: str) -> List[str]:
        final = []
        i = 0

        while i < len(s):
            j = i
            while s[j] != "#":
                
                j+=1
                
            length = int(s[i:j])
            start = j + 1
            word = s[start:start+length]
            final.append(word)
            i=start +length
        return final
            
                                


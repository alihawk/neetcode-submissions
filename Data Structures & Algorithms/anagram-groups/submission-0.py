class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        decider={}
        
        for word in strs:
            key = "".join(sorted(word))
            if key not in decider.keys():
                decider[key] = [word]
            else:
                decider[key].append(word)
        return list(decider.values())
            

            


class Solution:
    def isPalindrome(self, s: str) -> bool:
        s = s.lower()
        if len(s) == 0 or len(s) == 1:
            return True
        clean = []
        for word in s: 
            if word.isalnum():
                    clean.append(word)
        clean = "".join(clean)
        return clean == clean[::-1]
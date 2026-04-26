class Solution:
    def isValid(self, s: str) -> bool:
        checkList = []
        pairs = {"}":"{",")":"(","]":"["}
        for ch in s:
                      
            if ch in pairs.values():
                checkList.append(ch)
            else:
                if not checkList:
                    return False
                top = checkList.pop()
                if top != pairs[ch]:
                    return False

        if not checkList: 
            return True
        else:
            return False


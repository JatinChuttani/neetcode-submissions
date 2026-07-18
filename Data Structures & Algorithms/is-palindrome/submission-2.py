class Solution:
    def isPalindrome(self, s: str) -> bool:
        srt = ""

        for word in s:
            if word.isalnum():
                srt += word.lower()

        first = 0
        last = len(srt)-1

        while first < last:
            if srt[first] != srt[last]:
                return False

            first += 1
            last -= 1

        return True
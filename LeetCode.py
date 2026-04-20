# ---------------Q.1 Two Sum Problem in Python---------------
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                sum = nums[i] + nums[j]
                if sum == target:
                    return[i,j]


# ----------------Q.9. Palindrome Number--------------------
class Solution:
    def isPalindrome(self, x: int) -> bool:

        # negative numbers palindrome nahi hote
        if x < 0 or (x % 10 == 0 and x != 0):
            return False
        input_num = x
        new_num = 0
        while (x > 0):
            last_digit = x % 10
            new_num = new_num * 10 + last_digit
            x = x //10
        return new_num == input_num

# ----------------Q.13. Roman to Integer------------------------
class Solution:
    def romanToInt(self, s: str) -> int:

        roman = {
            'I': 1, 
            'V': 5, 
            'X': 10,
            'L': 50, 
            'C': 100,
            'D': 500, 
            'M': 1000
        }

        n = len(s)
        result = 0
        for i in range(0,n):
    
            # jaise I mean 1 or V means 5  lekin IV mean 4 to yah pe subtract hoga
            # "MCMXCIV" = 1994..... M means 1000 or C mean 100 to minus...M = 1000, CM = 900, XC=90, IV=4 ---> TOTAL = 1994  (baki sab plus... "LVIII" L=50, VIII=8 ---> TOTAL= 58 )

            if i < n-1 and roman[s[i]] < roman[s[i + 1]]:
                result -= roman[s[i]]
            else:
                result += roman[s[i]]
        return result
                
                
                
# ----------------Q.14. Longest Common Prefix-------------------
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        # Initialize an empty result string
        res = ""
        
        # Loop through each character index of the first string
        for i in range(len(strs[0])):
            ch = strs[0][i]  # Get the character at the current index
            
            # Compare this character with the corresponding character in each string
            for s in strs:
                # If we are out of bounds for any string, or there's a mismatch
                if i >= len(s) or s[i] != ch:
                    return res  # Return the common prefix found so far
            
            # If the character matches in all strings, add it to the result
            res += ch
        return res  # Return the longest common prefix


        # ------------------
        # cp=""
        # for i in range(len(strs[0])):
        #     ch = strs[0][i]
        #     for s in strs:
        #         if i == len(s) or s[i] != ch:
        #             return cp
        #             cp += ch
        # return cp
        # -------------------
        
        # pref = strs[0]
        # pref_len = len(pref)
        # for s in strs[1:]:
        #     while pref != s[0:pref_len]:
        #         pref_len -=1
        #         if pref_len == 0:
        #             return""
        #             pref = pref[0:pref_len]
                    
        # return pref


# ---------------------Q.509. Fibonacci Number --------------------------
class Solution:
    def fib(self, n: int) -> int:

        def fun(num):              # ye nested function h isliye self use nahi kiye h
            if num <= 1:           # recurssion ko stop krta h
                return num
            return fun(num-1) + fun(num-2)          # fibonacci formula --> F(n) = F(n-1) + F(n-2)

        return fun(n)             # yah ape function ko call kie h 



# ------------------------Q. 66. Plus One ---------------------------------
class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        n = len(digits)
        
        # last se start karenge
        for i in range(n-1, -1, -1):

            if digits[i] < 9:
                digits[i] += 1
                return digits
                
            else:
                digits[i] = 0   # carry aage jayega

        # agar sab 9 the (jaise [9,9])
        return [1] + digits
                        


# --------------------------Q. 67. ADD Binary ------------------------------
class Solution:
    def addBinary(self, a: str, b: str) -> str:

        i = len(a) - 1            #last digit se start krenge
        j = len(b) - 1
        carry = 0
        result = ""

        while i >= 0 or j >= 0 or carry:
            sum = carry
            if i >= 0:
                sum += int(a[i])
                i -= 1
                
            if j >= 0:
                sum += int(b[j])
                j -= 1

            result = str(sum % 2) + result       # current digit k liye
            carry = sum // 2                     #  carry krne k liye
        return result



# ------------------Q. 202. Happy Number ---------------------------
class Solution:
    def isHappy(self, n: int) -> bool:

        seen = set()

        while n != 1 and n not in seen:
            seen.add(n)

            total = 0
            while n > 0:
                digit = n % 10
                total += digit * digit
                n //= 10

            n = total

        return n == 1
        


# ---------------Q.258. Add Digits ------------------------------------
class Solution:
    def addDigits(self, num: int) -> int:

        while num >= 10:   # jab tak 2 digit hai
            total = 0

            while num > 0:
                total += num % 10
                num //= 10

            num = total

        return num


# -------------Q. Ugly Number-----------------------------------
class Solution:
    def isUgly(self, n: int) -> bool:

        if n <= 0:
            return False

        for i in [2, 3, 5]:
            while n % i == 0:
                n //= i

        return n == 1


# ---------------Q. 326. Power of Three -------------------------
class Solution:
    def isPowerOfThree(self, n: int) -> bool:
        if n <= 0:
            return False

        while n % 3 == 0:
            n //= 3

        return n == 1
        


# ---------------Q. 342. Power of Four ----------------------
class Solution:
    def isPowerOfFour(self, n: int) -> bool:

        if n <= 0:
            return False

        while n % 4 == 0:
            n //= 4

        return n == 1

# ------------------Q.367. Valid Perfect Square ----------------
class Solution:
    def isPerfectSquare(self, num: int) -> bool:

        left, right = 1, num

        while left <= right:
            mid = (left + right) // 2
            square = mid * mid

            if square == num:
                return True
            elif square < num:
                left = mid + 1
            else:
                right = mid - 1

        return False



# ------------------------Q. 404.Convert a number to hexadecimal-------------
class Solution:
    def toHex(self, num: int) -> str:

        if num == 0:
            return "0"

        hex_chars = "0123456789abcdef"
        result = ""

        # handle negative using 32-bit
        if num < 0:
            num += 2**32

        while num > 0:
            remainder = num % 16
            result = hex_chars[remainder] + result
            num //= 16

        return result
    


# -------------Q.492. Construct the rectangle --------------------------------
class Solution:
    def constructRectangle(self, area: int):

        import math

        w = int(math.sqrt(area))

        while area % w != 0:
            w -= 1

        l = area // w

        return [l, w]


        

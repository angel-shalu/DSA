# Q.1 Two Sum Problem in Python
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(0,len(nums)):
            for j in range(i+1,len(nums)):
                sum = nums[i] + nums[j]
                if sum == target:
                    return[i,j]
                
                
                
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

    
        
                        

                        

                        

                        

    



        
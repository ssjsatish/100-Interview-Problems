# Approach #01
'''
    Using 2 loops to check every combination if there is a pair whose sum equals to the given number.
    Time: O(n^2)
    Space: O(1)
'''
def twoSum(ar, k):
    for i in range(len(ar)-1):
        for j in range(i+1, len(ar)):
            if((ar[i]+ar[j])==k):
                return sorted([ar[i],ar[j]]) 
    return []
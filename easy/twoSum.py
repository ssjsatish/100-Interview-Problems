# Approach #01
'''
    Using 2 loops to check every combination if there is a pair whose sum equals to the given number.
    Time: O(n^2)
    Space: O(1)
'''
def twoSum(array, targetSum):
    return []


# Approach #02
'''
    Using a hash/dictionary to lookup if
    Time: O(n)
    Space: O(n)
'''
def twoSumUsingDictionary(ar, k):
    
    return []

# Approach #03
'''
    Using a sort function to sort the given list first then use binary search method.
    Time: O(n log(n))
    Space: O(1)
'''
def twoSumUsingSort(ar, k):
    ar.sort()
    left = 0
    right = len(ar)-1
    while left < right:
        twoSum = ar[left]+ar[right]
        if twoSum == k:
            return sorted( [ ar[left], ar[right] ] )
        elif twoSum < k:
            left = left + 1
        elif twoSum > k:
            right = right - 1
    return []
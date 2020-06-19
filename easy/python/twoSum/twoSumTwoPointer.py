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
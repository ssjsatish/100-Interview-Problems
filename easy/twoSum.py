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


# Approach #02
'''
    Using a hash/dictionary to lookup if
    Time: O(n)
    Space: O(n)
'''
def twoSumUsingDictionary(ar, k):
    d = {}
    for i in range(len(ar)):
        if k-ar[i] in d:
            return sorted([k-ar[i], ar[i]])
        else:
			d[ar[i]] = True
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
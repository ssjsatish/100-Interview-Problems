
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
# O(nlogn) Simple but not the best
def findThreeLargestNumbers(array):
    array.sort()
    return array[-3:]
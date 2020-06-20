import heapq
def findThreeLargestNumbers(array):
	heaps = array
	heapq.heapify(heaps)
	return sorted(heapq.nlargest(3, heaps))
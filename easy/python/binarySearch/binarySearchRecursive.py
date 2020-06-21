def findIndex(array, target, left,right):
	if left>right:
		return -1
	mid = (left+right)//2
	if array[mid]==target:
		return mid
	elif array[mid]>target:
		return findIndex(array, target, left, mid-1)
	else:
		return findIndex(array, target, mid+1, right)
	
		
def binarySearch(array, target):
	return findIndex(array, target, 0, len(array)-1)


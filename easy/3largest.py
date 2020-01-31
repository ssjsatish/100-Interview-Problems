def findThreeLargestNumbers(array):
    array.sort()
	return array[-3:]

def threeLargestNumbers(a):
    ans = [None]*3
    # traverse and keep track of 3 elements
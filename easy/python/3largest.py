# O(nlogn) Simple but not the best
def findThreeLargestNumbers(array):
    array.sort()
	return array[-3:]

# O(n) simple and a lot better
def threeLargestNumbers(a):
    ans = [None]*3
    # traverse and keep track of 3 elements
class BinaryTree:
	def __init__(self, value):
		self.left = None
		self.right = None
		self.value = value
	def branchSums(root):
		sums = []
		branchSumsRecurse(root, 0, sums)
	def branchSumsRecurse(node, runningSum, sums):
		if node is None:
			return
		newRunningSum = runningSum + node.value
		if node.left is None and node.right is None:
			sums.append(newRunningSum)
			return
		branchSumsRecurse(node.left, newRunningSum, sums)
		branchSumsRecurse(node.right, newRunningSum, sums)
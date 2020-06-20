'''
array = [5,1,22,25,6,-1,8,10]
sequence = [1,6,-1,10]

check if sequence is subsequence of array
'''

def isValidSubsequence(array, sequence):
    result = True
    for i in sequence:
        if i in array:
            array = array[array.index(i)+1:]
        else:
            return False
    return result
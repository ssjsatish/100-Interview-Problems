def getNthFib(n):
    fib = [0]*n
    fib[1] = 1
    counter = 2
    while counter <= n:
        fib[counter] = fib[counter-1] + fib[counter-2]
        counter +=1
    return fib[n-1]

print(getNthFib(2))
        
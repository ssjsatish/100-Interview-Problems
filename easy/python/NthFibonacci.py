def getNthFib(n):
    a = 0
    b = 1
    counter = 3
    while counter <= n:
        fib = a + b
        a,b = b,fib
        counter +=1
    return b if n>1 else fib

n = 6
print(getNthFib(n))
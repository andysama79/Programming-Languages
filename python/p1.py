import sys

def minSum(N, A, B):
    # write your code here
    a = sorted(A)
    b = sorted(B, reverse=True)
    P = 0

    for i in range(N):
        index = A.index(a[i])
        B[index] = b[i]
    
    for i in range(N):
        for j in range(i, N):
            for k in range(i, j+1):
                P += int(A[k]) * int(B[k])

    return P % (10 ** 9 + 7)

def main():
    N = int(sys.stdin.readline().strip())

    A = []
    for _ in range(N):
        A.append(sys.stdin.readline().strip())

    B = []
    for _ in range(N):
        B.append(sys.stdin.readline().strip())

    result = minSum(N, A, B)

    print(result)

if __name__ == "__main__":
    main()  

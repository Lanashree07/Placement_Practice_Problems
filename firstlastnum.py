# Given two integers a and b in the form of strings. Return the last digit of ab.

# Examples:

# Input: a = "3", b = "10"
# Output: 9
# Explanation: 3^10 = 59049. Last digit is 9.

# Input: a = "6", b = "2"
# Output: 6
# Explanation: 6^2 = 36. Last digit is 6.

def firstDigit(n):
    while n >= 10:
        n = n // 10

    return n


def lastDigit(n):
    return n % 10


n = 98562

print(firstDigit(n), end=" ")
print(lastDigit(n))
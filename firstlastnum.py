# Given two integers a and b in the form of strings. Return the last digit of ab.

# Examples:

# Input: a = "3", b = "10"
# Output: 9
# Explanation: 3^10 = 59049. Last digit is 9.

# Input: a = "6", b = "2"
# Output: 6
# Explanation: 6^2 = 36. Last digit is 6.

def lastDigit(a: str, b: str) -> int:
    if b == "0":
        return 1

    a = int(a[-1])
    b = int(b)

    return pow(a, b, 10)


# Given examples
print(lastDigit("3", "10"))
print(lastDigit("6", "2"))
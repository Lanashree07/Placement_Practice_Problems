//Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.
//Examples:

//Input: n = 15
//Output: false
//Explanation: The number is not divisible by 2, Odd number.

//Input: n = 44
//Output: true
//Explanation: The number is divisible by 2, Even number.

public class evenoddnumber {
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n1 = 15 , n2 = 44;
        if (isEven(n1)) {
            System.out.println(n1 + " is even: true");
        } else {
            System.out.println(n1 + " is even: false");
        }
        if (isEven(n2)) {
            System.out.println(n2 + " is even: true");
        } else {
            System.out.println(n2 + " is even: false");
        }
    }
}

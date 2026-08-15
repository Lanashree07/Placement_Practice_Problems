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
        int n1 = 15;
        System.out.println("Input: n = " + n1);
        System.out.println("Output: " + isEven(n1)); // Output: false

        int n2 = 44;
        System.out.println("Input: n = " + n2);
        System.out.println("Output: " + isEven(n2)); // Output: true
    }
}
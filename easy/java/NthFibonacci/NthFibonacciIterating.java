package NthFibonacci;

public class NthFibonacciIterating {
    public static void main(String[] args) {
        int n = 6;

        int num0 = 0;
        int num1 = 1;
        int i = 3;
        if (n == 1 || n == 2) {
            System.out.println(n - 1);
        }
        while (i <= n) {
            int temp = num1;
            num1 = num0 + num1;
            num0 = temp;
            i++;
        }

        System.out.println(num1);

    }
}
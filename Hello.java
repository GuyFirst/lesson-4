public class Hello {
    public static void main(String[] args) {
        Random random = new Random();

        int n = random.nextInt(30) + 1; // 1 to 30

        long result = fibonacci(n);

        System.out.println("Calculated the " + n + "th Fibonacci number: " + result);
    }

    public static long fibonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        long a = 0, b = 1, c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return b;
    }
}
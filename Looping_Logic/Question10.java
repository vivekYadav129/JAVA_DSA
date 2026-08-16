class Question10 {
    public static void main(String[] args) {
        int n = 10;

        int a = 0;
        int b = 1;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + a;

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println("Sum = " + sum);
    }
}
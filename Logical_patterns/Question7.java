class Question7 {
    static int sumOfFactors(int n) {

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int result = sumOfFactors(12);
        System.out.println(result);
    }
}
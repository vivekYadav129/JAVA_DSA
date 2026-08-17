class Question4 {
    static int findHCF(int a, int b) {
        int hcf = 1;

        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        return hcf;
    }

    public static void main(String[] args) {
        int result = findHCF(12, 18);
        System.out.println(result);
    }
}
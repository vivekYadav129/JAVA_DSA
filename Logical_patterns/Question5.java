class Question5 {
    static int findLCM(int a, int b) {

        int lcm = 0;

        for (int i = 1; ; i++) {
            int multiple = a * i;

            if (multiple % b == 0) {
                lcm = multiple;
                break;
            }
        }

        return lcm;
    }

    public static void main(String[] args) {
        int result = findLCM(12, 18);
        System.out.println(result);
    }
}
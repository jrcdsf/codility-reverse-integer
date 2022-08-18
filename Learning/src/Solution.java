class Solution {
    public void solution(int N) {
        int enable_print = 0;
        int result = 0;
        while (N > 0) {
            result = (result * 10) + (N % 10);
            if (N % 10 == N) {
                enable_print = 1;
            }
            if (enable_print == 1) {
                System.out.println(result);
            }
            N = N / 10;
        }
    }
}

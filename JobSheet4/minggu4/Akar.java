package minggu4;

public class Akar {
    public static int AkarBF(int n) {
        int akar = 0;
        while (akar * akar <= n) {
            akar++;
        }
        return akar - 1;
    }
    public static int AkarDC(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int start = 1, ans = 0, end = n;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}

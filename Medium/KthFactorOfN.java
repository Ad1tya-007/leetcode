package Medium;

import java.util.ArrayList;
import java.util.List;

public class KthFactorOfN {
    public static int kthFactor(int n, int k) {
        List<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        if (factors.size() < k) {
            return -1;
        }
        return factors.get(k - 1);
    }

    public static void main(String[] args) {
        System.out.println(kthFactor(12, 3));
        System.out.println(kthFactor(7, 3));
    }
}

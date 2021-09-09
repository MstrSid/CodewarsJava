package are_same;

import java.util.Arrays;

public class AreSame {
    public static void main(String[] args) {
        boolean r = comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11},
                new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361});
        System.out.println(r);
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            a[i] *= a[i];
        }
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}

import java.util.Arrays;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0927 10:23
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] a = {9, 3, 7, 2, 5, 8, 1, 4};
        insert(a);
    }

    private static void insert(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int t = a[i];
            int j = i - 1;
            while (j >= 0) {
                if (t < a[j]) {
                    a[j + 1] = a[j];
                } else {
                    break;
                }
                j--;
            }
            a[j + 1] = t;
        }
        System.out.println(Arrays.toString(a));
    }
}

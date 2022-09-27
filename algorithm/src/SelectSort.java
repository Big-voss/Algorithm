import java.util.Arrays;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0925 15:16
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 1, 9, 8, 4};
        selection(a);
    }

    private static void selection(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int s = i;
            for (int j = s + 1; j < a.length; j++) {
                if (a[s] > a[j]) {
                    s = j;
                }
            }
            if (s != i) {
                swap(a, s, i);
            }
            System.out.println(Arrays.toString(a));
        }
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

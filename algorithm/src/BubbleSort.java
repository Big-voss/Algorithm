import java.util.Arrays;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0924 23:18
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {5, 9, 7, 4, 1, 3, 2, 8};
        //int [] a={1,2,3,4,5,6,7,8,9};
        bubble_v2(a);
    }

    public static void bubble_v2(int[] a) {
        int n = a.length - 1;
        while (true) {
            int last = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    last = i;
                }
            }
            n = last;
            System.out.println("冒泡: "+ Arrays.toString(a));
            if (n == 0) {
                break;
            }
        }
    }


    public static void bubble(int[] a) {
        boolean swapped = false;
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - 1 - j; i++) {
                System.out.println("比较了" + i + "次");
                if (a[i] > a[i + 1]) {
                    swap(a, i, i + 1);
                    swapped = true;
                }
            }
            System.out.println("第" + (j + 1) + "轮冒泡排序: " + Arrays.toString(a));
            if (swapped == false) {
                break;
            }
        }

    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}

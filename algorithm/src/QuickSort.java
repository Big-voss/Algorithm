import java.util.Arrays;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0927 17:08
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 7, 2, 9, 8, 1, 4};
        quick(a, 0, a.length - 1);
    }

    private static void quick(int[] a, int l, int h) {
        if (l >= h) {
            return;
        }
        int p = partition(a, l, h);//p索引值
        quick(a, l, p - 1);//左边分区的范围确定
        quick(a, p + 1, h);//右边分区的范围确定
    }

    private static int partition(int[] a, int l, int h) {
        int pv = a[h];//标记基准点元素
        int i = l;
        for (int j = l; j < h; j++) {
            if (a[j] < pv) {
                swap(a,i,j);
                i++;
            }
        }
        if (i != h) {
            swap(a,h,i);
        }
        System.out.println(Arrays.toString(a) + "i=" + i);
        //返回代表基准点的正确索引下标i,确定下一轮分区的边界值(左边分区和右边分区)
        return i;
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

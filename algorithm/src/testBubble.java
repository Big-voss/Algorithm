import java.util.Arrays;
import java.util.Scanner;

/**
 * @author zzb
 * @version V1.0
 * @creat 2022 0925 16:35
 */
public class testBubble {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int first = nums.length-1;
        while (true){
            int last = 0;
            for (int i = 0; i < first; i++) {
                if (nums[i] > nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;

                    last = i;
                }
            }
            first = last;
            if(first==0){
                break;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

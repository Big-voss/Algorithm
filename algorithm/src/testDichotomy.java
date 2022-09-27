import java.util.Scanner;

public class testDichotomy {

    public static void main(String[] args) {
        testDichotomy test = new testDichotomy();
        Scanner scanner = new Scanner(System.in);
        int arr[] = {1,2,3,4,5,6,7,9,88,100};
        int a = scanner.nextInt();
        int i = test.binarySearch(arr, a);
        System.out.println(i);
    }

    public int binarySearch (int[] arr, int a) {
        // write code here
        int l = 0, r = arr.length - 1, m;
        while(l<=r){
            m = l + (r - l) / 2;
            if(arr[m]<a){
                l = m + 1;
            }
            if(arr[m]>=a){
                r = m -1;
            }
        }
        if(l == arr.length){
            return -1;
        }
        return l;
    }
}
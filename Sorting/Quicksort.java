import java.util.*;

public class Quicksort {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int ar[] = new int[n];
        for (int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        quick(ar, 0, n - 1);
        System.out.println("Sorted array is");
        for (int i = 0; i < n; i++)
            System.out.print(ar[i] + " ");
    }

    public static void quick(int[] ar, int l, int h) {
        if (l < h) {
            int index = parti(ar, l, h);
            quick(ar, l, index - 1);
            quick(ar, index + 1, h);
        }
    }

    public static int parti(int[] ar, int l, int h) {

        int pivot = ar[h];
        int i = l - 1;
        for (int k = l; k < h; k++) {
            if (ar[k] < pivot) {
                i++;
                int temp = ar[i];
                ar[i] = ar[k];
                ar[k] = temp;

            }
        }
        int temp = ar[i + 1];
        ar[i + 1] = ar[h];
        ar[h] = temp;
        return (i + 1);
    }

}

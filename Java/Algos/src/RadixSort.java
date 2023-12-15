public class RadixSort implements Algorithms{
    public int[] sort(int[] a) {
        int max = getMax(a);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(a, exp);
        }
        return a;
    }

    public static void countSort(int[] a, int exp) {
        int[] output = new int[a.length];
        int[] count = new int[10];
        for (int i = 0; i < a.length; i++) {
            count[(a[i] / exp) % 10]++;
        }
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        for (int i = a.length - 1; i >= 0; i--) {
            output[count[(a[i] / exp) % 10] - 1] = a[i];
            count[(a[i] / exp) % 10]--;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = output[i];
        }
    }

    public static int getMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i])
                max = a[i];
        }
        return max;
    }

    public static void print(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

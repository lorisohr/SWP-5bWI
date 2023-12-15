public class BubbleSort implements Algorithms {
    public int[] sort(int[] a) {
        boolean swapped = true;
        int left = 0;
        int right = 0;
        do {
            swapped = false;
            for (int i = 0; i < a.length; i++) {
                if (i + 1 != a.length) {
                    left = a[i];
                    right = a[i + 1];
                    if (left > right) {
                        a[i + 1] = left;
                        a[i] = right;
                        swapped = true;
                    }
                } else if (i + 1 == a.length) {
                    break;
                }
            }
        } while (swapped);
        return a;
    }
}

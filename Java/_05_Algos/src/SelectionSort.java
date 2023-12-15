public class SelectionSort implements Algorithms {
    public int[] sort(int[] a) {
        int mem = 0;
        for(int i = 0; i < a.length; i++) {
            mem = a[i];
            for(int j = i; j < a.length; j++) {
                if (mem > a[j])
                {
                    mem = a[j];
                    a[j] = a[i];
                }
                a[i] = mem;

            }
        }
        return a;
    }
}


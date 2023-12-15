public class SelectionSort implements Algorithms {
    public int[] sort(int[] a) {
        int mem = 0;
        int n1 = 0;
        int n2 = 0;
        int[] result = new int[a.length];
        for(int i = 0; i < a.length; i++) {
            mem = a[i];
            for(int j = 0; j < a.length; j++) {
                if (mem > a[j])
                {
                    mem = a[j];
                }
            }
            result[i] = mem;
        }
        return result;
    }
}


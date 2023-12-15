public class DataGenerator {
    public static int[] generateData(int size) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random() * 1000);
        }
        return a;
    }

    public static int[] generateData(int size,int min, int max) {
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = (int)(Math.random() * (max - min + 1) + min);
        }
        return a;
    }

    public static void printArray (int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}

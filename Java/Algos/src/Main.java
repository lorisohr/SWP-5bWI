public class Main {
    public static void main(String[] args) {
        int[] a = DataGenerator.generateData(10);
        Sorter sorter = new Sorter();
        sorter.setAlgorithm(new SelectionSort());
        a = sorter.sort(a);
        DataGenerator.printArray(a);
    }
}

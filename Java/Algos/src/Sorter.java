public class Sorter {
    private Algorithms algorithm;
    public void setAlgorithm(Algorithms algorithm) {
        this.algorithm = algorithm;
    }
    public int[] sort(int[] a) {
        return algorithm.sort(a);
    }
}

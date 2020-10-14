public class Exercise1 {
    public int calculateSum(int[] arrayOfInts) {
        if (arrayOfInts==null) return 0;
        int sum = 0;
        for (int i : arrayOfInts) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Exercise1 ex = new Exercise1();
        int result = ex.calculateSum(new int[]{1, 2, 3, 4});
        System.out.println(result);
    }
}

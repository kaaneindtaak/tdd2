import java.util.Arrays;

public class Exercise2 {
    public int[] swapElements(int[] inputArray) {
        int[] result = Arrays.copyOf(inputArray, inputArray.length);
        if (inputArray.length <= 1) return result;

        int smallestIndex = 0;
        int largestIndex = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[smallestIndex])
                smallestIndex = i;
            if (inputArray[i] > inputArray[largestIndex])
                largestIndex = i;
        }

        int temp = result[smallestIndex];
        result[smallestIndex] = result[largestIndex];
        result[largestIndex] = temp;
        return result;
    }

}


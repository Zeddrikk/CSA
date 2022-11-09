package mostFrequent;

public class RayMostFreq {
    public static int go(int[] arr) {

        int maxCount = 0;
        int maxElement = 0;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                maxElement = arr[i];
            }
        }

        return maxElement;
    }
}
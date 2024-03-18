public class Minimum {
    public static int mini(int[] arr) {
        int min = arr[0];
        // Loop 1 for Minimum:
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

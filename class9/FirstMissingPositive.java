// https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1){
                return j+1;
            }
        }

        // case 2
        return arr.length;
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}

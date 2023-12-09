import java.util.ArrayList;
public class MergedSort {
    public static void main(String[] args) {
        int[] sortedArray1 = {1, 2, 3, 4};
        int[] sortedArray2 = {2, 4, 6, 8};
        ArrayList<Integer> mergedList = mergeSortedArrays(sortedArray1, sortedArray2);
        System.out.println("Merged Array: " + mergedList);
    }

    private static ArrayList<Integer> mergeSortedArrays(int[] sortedArray1, int[] sortedArray2) {
        ArrayList<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < sortedArray1.length && j < sortedArray2.length) {
            if (sortedArray1[i] < sortedArray2[j]) {
                mergedList.add(sortedArray1[i]);
                i++;
            } else if (sortedArray1[i] > sortedArray2[j]) {
                mergedList.add(sortedArray2[j]);
                j++;
            } else {
                // If you want to avoid duplicates, skip this block
                mergedList.add(sortedArray1[i]);
                i++;
                j++;
            }
        }

        while (i < sortedArray1.length) {
            mergedList.add(sortedArray1[i]);
            i++;
        }

        while (j < sortedArray2.length) {
            mergedList.add(sortedArray2[j]);
            j++;
        }

        return mergedList;
    }
}

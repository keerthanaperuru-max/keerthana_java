public class ArrayOperations {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        //access
        int index = 2;
        System.out.println("Access element at index " + index + ": " + arr[index]);
        //insert
        int[] newArrInsert = new int[n + 1];
        int insertIndex = 2;
        int insertValue = 25;
        for (int i = 0, j = 0; i < newArrInsert.length; i++) {
            if (i == insertIndex) {
                newArrInsert[i] = insertValue;
            } else {
                newArrInsert[i] = arr[j];
                j++;
            }
        }
        System.out.print("Array after insertion: ");
        for (int val : newArrInsert) {
            System.out.print(val + " ");
        }
        System.out.println();
        //delete
        int deleteIndex = 3;
        int[] newArrDelete = new int[n - 1];

        for (int i = 0, j = 0; i < n; i++) {
            if (i != deleteIndex) {
                newArrDelete[j] = arr[i];
                j++;
            }
        }
        System.out.print("Array after deletion: ");
        for (int val : newArrDelete) {
            System.out.print(val + " ");
        }
    }
}

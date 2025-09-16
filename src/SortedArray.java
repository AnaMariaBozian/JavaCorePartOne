import java.util.Arrays;

public class SortedArray {

    public static void organizedArray(int[] arr){
        Arrays.sort(arr);
        boolean result = true;

        for (int i = 0; i < arr.length -1; i++){
            if (arr[i] > arr[i + 1]){
                result = false;
                break;
            }
        }

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("is the array sorted? " + result);
    }

    public static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean result = true;


        for (int i = 0; i <n-1; i++){
            for (int j= 0; j < n-i-1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j +1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length -1; i++){
            if (arr[i] > arr[i + 1]){
                result = false;
                break;
            }
        }

        for (int num : arr){
            System.out.print(num + " ");
        }

        System.out.println("\nis the array sorted? " + result);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 3, 6, 5};

        organizedArray(numbers);

        bubbleSort(numbers);
    }
}

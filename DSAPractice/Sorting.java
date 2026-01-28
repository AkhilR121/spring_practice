public class Sorting {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        int arrOne[] = {1, 2, 3, 4, 5, 6};
        SelectionSort ss = new SelectionSort();
        BubbleSort bs = new BubbleSort();
        InsertionSort ins = new InsertionSort();

        ss.selectionSorting(arr);
        bs.bubbleSorting(arr);
        ins.insertionSorting(arr);
    }
}

class SelectionSort {
    public void selectionSorting(int arr[]) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int minValue = i;

            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minValue]) {
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }

        System.out.print("Selection Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

//Push the maximum to the last by adjacent swapping
class BubbleSort {
    public void bubbleSorting(int arr[]){
        for (int i = arr.length - 1; i >= 0; i--) {
            int didSwap = 0;
            for(int j = 0; j <= i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j]; 
                    arr[j] = temp;
                    didSwap = 1;
                }
            }

            //If the given array already sorted then no need to loop over N-1 times
            //Time Complexity: O(N)
            if(didSwap == 0){
                break;
            }
        }

        System.out.print("\nBubble Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}

class InsertionSort {
    public void insertionSorting(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while ( j > 0 && arr[j - 1] > arr[j]) { 
                int temp = arr[j + 1];
                arr[j + 1] = arr[j]; 
                arr[j] = temp; 
                j--;  
            }
        }

        System.out.print("\nInsertion Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
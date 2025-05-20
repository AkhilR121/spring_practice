public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {13, 46, 24, 52, 20, 9};
        TimeComplexity tc = new TimeComplexity();
        tc.selectionSort(arr);

        for (int i = 0; i <= arr.length - 2; i++) {
            int minValue = i;
            
            for (int j = i; j <= arr.length - 1; j++) {
                if(arr[j] < arr[minValue]) minValue = j;
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}

class TimeComplexity{
    public void selectionSort(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }
    }
}
package DSA;

public class XShort {
    public static void bubbleSort(int arr[]) {
        int arrsize = arr.length;
        int temp = 0;
        System.out.println("Before Sorting");
        for (int num : arr)
            System.out.print(num + " ");


        for (int i = 0; i < arrsize; i++) {
            for (int j = 0; j < arrsize - i - 1; j++) {
                // why arrsize-i-1?
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


        System.out.println();
        System.out.println("After Sorting");
        for (int num : arr)
            System.out.print(num + " ");
    }


    public static void selectionSort(int[] arr) {
        int size = arr.length;
        int small = 0;
        int minIndex = 0;
        System.out.println("Before Sorting");
        for (int num : arr)
            System.out.print(num + " ");


        for (int i = 0; i < size - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            small = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = small;

        }


        System.out.println();
        System.out.println("After Sorting");
        for (int num : arr)
            System.out.print(num + " ");


    }

public static void quicksort(int [] arr,int low,int high){
    if(low<high){
        int pivot= partition(arr,low,high);
        quicksort(arr,low,pivot-1);
        quicksort(arr,pivot+1,high);
    }
}

public static int partition(int [] arr,int low,int high){

        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
    swap(arr,i+1,high);
        return i+1;

}

    private static void swap(int [] arr,int i, int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        int[] arr = {12, 7, 4, 9,1,6,10,8,30,20,17,15};//
//        bubbleSort(arr);
//        selectionSort(arr);
//        insertionSort(arr);
        quicksort(arr,0,arr.length-1);

        for(int num:arr)
            System.out.print(num+" ");
    }



    private static void insertionSort(int[] arr) {
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}

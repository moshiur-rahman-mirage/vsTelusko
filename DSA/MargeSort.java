package DSA;

public class MargeSort {
    public static void main(String[] args) {
        int [] arr= {1,4,2,6,3,8,7};
        System.out.println("Before Sort");
        printArray(arr);
        margeSort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After Sort");
        printArray(arr);
    }

    private static void margeSort(int[] arr, int left, int right) {
        if(left<right) {
            int mid = (left + right) / 2;
            margeSort(arr, left, mid);
            margeSort(arr, mid + 1, right);
            marge(arr, left, mid, right);
        }

    }

    private static void marge(int[] arr, int left, int mid, int right) {
        int lArrSize = mid-left+1;
        int rArrSize=right-mid;
        int lArr []=new int[lArrSize];
        int rArr []= new int[rArrSize];

        for (int x=0;x<lArrSize;x++){
            lArr[x]=arr[left+x];
        }

        for (int x=0;x<rArrSize;x++){
            rArr[x]=arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=left;

        while (i<lArrSize && j<rArrSize){
            if(lArr[i]<=rArr[j]){
                arr[k]=lArr[i];
                i++;
            }else{
                arr[k]=rArr[j];
                j++;
            }
            k++;
        }

        while (i<lArrSize){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while (j<rArrSize){
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }

    public static void printArray(int [] arr){
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}

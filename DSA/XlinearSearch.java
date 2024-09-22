package DSA;


import java.util.Scanner;

public class XlinearSearch {
    public String linearSearch(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return "Traget "+target + " found at "+i+" Position";
            }
        }
        return "Traget Not Found ";
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 32, 89, 4, 6, 7, 34, 700};
        int target=55;

        XlinearSearch x = new XlinearSearch();
        String response=x.linearSearch(arr,target);
        System.out.println(response);



    }
}

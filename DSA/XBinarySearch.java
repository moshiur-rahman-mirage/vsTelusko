package DSA;

public class XBinarySearch {

    public int binarySearch(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
       while(left<=right){
           int mid= (left + right)/2;

           if (arr[mid]==target){
               return mid;
           } else if (arr[mid]<target) {
                left=mid+1;
           }else{
               right=mid-1;
           }

       }


        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,3,4,6,7,9,12,29,34,56,78,90,123,456,800};
        int target=900;
        XBinarySearch xb = new XBinarySearch();
        int res=xb.binarySearch(nums,target);
        System.out.println(res);

    }
}

package DSA;

public class XbinaryRecursive {

    public static int binaryRecursive(int[]arr,int target,int left,int right){

        if(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target)
                return mid;
             else if (arr[mid]<target)
                return binaryRecursive(arr,target,mid+1,right);
            else
                return binaryRecursive(arr,target,left,mid-1);

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,23,23};
        int target=5;
        int res=binaryRecursive(arr,target,0,arr.length-1);
        System.out.println(res);
    }
}

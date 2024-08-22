public class Xarray {
    public static void main(String[] args) {

        int nums[][] = new int[3][4];

        for(int i = 0;i<3;i++){
            for(int j=0;j<4;j++){
                int rand= (int) (Math.random()*10);
                nums[i][j]=rand;
                System.out.print(nums[i][j]);
            }
            System.out.println();

        }

        for(int n[]:nums){
            for (int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}

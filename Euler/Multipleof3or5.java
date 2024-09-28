package Euler;

public class Multipleof3or5 {
    public static void main(String[] args) {
        System.out.println(multiple3or5(1000));
    }

    private static int multiple3or5(int number) {
        int sum = 0;
        for(int i=0;i<number;i++){
            if(i%3==0 || i%5==0){
                sum+=i;
            }
        }


        return sum;
    }
}

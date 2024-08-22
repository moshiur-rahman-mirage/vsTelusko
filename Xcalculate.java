class Calculatorx{
    int res;
    int a;
    int b;
    public int Add(int a,int b){
        res=a+b;
        return res;
    }

}

public class Xcalculate {
    public static void main(String[] args) {
        int num1;
        int num2;
        num1=4;
        num2=5;

        Calculatorx cal = new Calculatorx();
        System.out.println(cal.Add(5,90));
    }
}

class Calculator{

    int a;
   public int printNUmber(int... numbers){
       for(int n:numbers){
           a+=n;
       }
       return a;
   }

}
public class XOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.printNUmber(3,5));
        System.out.println(cal.printNUmber(3,5,6,7,8));
    }
}

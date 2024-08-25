class A{
    public A(){
        System.out.println("in A");
    }
    public A(int a){
        System.out.println("In A int");
    }
}

class B extends A{
    public B(){
        super(7);
        System.out.println("in B");
    }
    public B(int a){
        super(6);
        System.out.println("In B int");
    }
}



public class XconAB {
    public static void main(String[] args) {
        B b = new B();
    }
}

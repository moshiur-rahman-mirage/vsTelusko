
class XX {
    void show(){
        System.out.println("In AX Show!");
    }
}

class XY extends XX{
    void show(){
        System.out.println("In BX Show!");
    }
}

public class XpolyAB {
    public static void main(String[] args) {
        XX a = new XY();
        a.show();
    }
}

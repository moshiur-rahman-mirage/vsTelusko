class Pen{
    public String getPen(int cost){
        return "Pen";
    }
}

public class Xclass1 {
    public static void main(String[] args) {
        Pen p = new Pen();
        String v = p.getPen(10);
        System.out.println(v);
    }
}

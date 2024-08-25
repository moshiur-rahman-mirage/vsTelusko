public class XstringTest {
    public static void main(String[] args) {
//        String s1="Moshiur";
//        s1=s1+" Rahman";
//        String s2="Moshiur";
//        System.out.println(s1);
//
//        System.out.println(s1==s2);

//        StringBuffer sb = new StringBuffer("Moshiur");
////        System.out.println(sb.length());
////        System.out.println(sb.capacity());
//
//        sb.append(" Rahman");
//
//        System.out.println(sb);
//        sb.deleteCharAt(4);
//        System.out.println(sb);


        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");

//        System.out.println("sb1  "+sb1);
//        System.out.println("s1==s2  "+s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println(sb1.toString().equals(s1));

    }
}

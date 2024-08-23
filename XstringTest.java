public class XstringTest {
    public static void main(String[] args) {
//        String s1="Moshiur";
//        s1=s1+" Rahman";
//        String s2="Moshiur";
//        System.out.println(s1);
//
//        System.out.println(s1==s2);

        StringBuffer sb = new StringBuffer("Moshiur");
//        System.out.println(sb.length());
//        System.out.println(sb.capacity());

        sb.append(" Rahman");

        System.out.println(sb);
        sb.deleteCharAt(4);
        System.out.println(sb);

    }
}

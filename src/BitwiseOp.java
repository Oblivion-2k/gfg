public class BitwiseOp {
    public static void main(String[] args) {
        int a =11;
        int b = 13;
        System.out.println(a|b); //15
        System.out.println(b|a); //15
        System.out.println(a&b); //9
        System.out.println(b&a); //9
        System.out.println(a^b); //6
        System.out.println(b^a); //6

        System.out.println(a<<3); //88
        System.out.println(a>>3); //1

        System.out.println(b<<3); //104
        System.out.println(b>>3); //1
    }
}

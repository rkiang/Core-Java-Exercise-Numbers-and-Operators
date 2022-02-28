public class toBinaryString {
    public static void main(String[] args) {
        int x = 2;
        int nine = 9;
        int seventeen = 17;
        int eigthyeight = 88;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(nine));
        System.out.println(Integer.toBinaryString(seventeen));
        System.out.println(Integer.toBinaryString(eigthyeight));

        //Left shift operator
        System.out.println(Integer.toBinaryString(2<<x));
        System.out.println(Integer.toBinaryString(2<< nine));
        System.out.println(Integer.toBinaryString(2<< seventeen));
        System.out.println(Integer.toBinaryString(2<< eigthyeight));
    }
}

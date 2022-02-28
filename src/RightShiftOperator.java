public class RightShiftOperator {
    public static void main(String[] args){
        int x = 150;
        int y = 225;
        int z = 1555;
        int c = 32456;

        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toBinaryString(c));

        //Right shift operator
        System.out.println(Integer.toBinaryString(2 >> x));
        System.out.println(Integer.toBinaryString(2 >> y));
        System.out.println(Integer.toBinaryString(2 >> z));
        System.out.println(Integer.toBinaryString(2 >> c));
    }
}

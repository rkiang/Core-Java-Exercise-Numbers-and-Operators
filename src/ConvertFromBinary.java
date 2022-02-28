public class ConvertFromBinary {
    static int binaryToDecimal(int i) {
        int num = i;
        int decimal = 0;
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            decimal += last_digit * base;
            base = base * 2;
        }
        return decimal;
    }
    public static void main(String[] args){
        System.out.println(binaryToDecimal(0010));
        System.out.println(binaryToDecimal(1001));
        System.out.println(binaryToDecimal(00110100));
        System.out.println(binaryToDecimal(001000011111));
        System.out.println(binaryToDecimal((int) 0010110001100111L));
    }
}

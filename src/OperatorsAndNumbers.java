public class OperatorsAndNumbers {
//    public static void main(String[] args) {
/*        int Decimal = 45;
        int Quotient1 = Decimal / 2;
        int Remainder1 = Decimal % 2;
        int Quotient2 = Quotient1 / 2;
        int Remainder2 = Quotient1 % 2;
        int Quotient3 = Quotient2 / 2;
        int Remainder3 = Quotient2 % 2;
        int Quotient4 = Quotient3 / 2;
        int Remainder4 = Quotient3 % 2;
        System.out.println(Quotient1);
        System.out.println(Remainder1);
        System.out.println(Quotient2);
        System.out.println(Remainder2);
        System.out.println(Quotient3);
        System.out.println(Remainder3);
        System.out.println(Quotient4);
        System.out.println(Remainder4);
        String Binary = new StringBuilder().append(Remainder4).append(Remainder3).append(Remainder2).append(Remainder1).toString();
        System.out.println(Binary);*/
        private static String convertToBinary(final int input) {
            int decimal = (int) Math.ceil(Math.log(input) / Math.log(2));
            int remainder = input;
            final StringBuilder output = new StringBuilder();
            while (decimal >= 0) {
                final int newDecimal = (int) Math.pow(2, decimal);
                if (remainder < newDecimal) {
                    output.append("0");
                } else {
                    output.append("1");
                    remainder -= newDecimal;
                }
                decimal--;
            }
            return output.toString();
        }

        public static void main(String... args) {
            System.out.println(convertToBinary(1));
            System.out.println(convertToBinary(8));
            System.out.println(convertToBinary(33));
            System.out.println(convertToBinary(78));
            System.out.println(convertToBinary(787));
            System.out.println(convertToBinary(33987));
    }
}
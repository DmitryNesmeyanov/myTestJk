public class BooleanZadacha {
    public static void main(String[] args) throws Expression {

            boolean ffff = booleanExpression(false, false, false, false);
            boolean tfff = booleanExpression(true, false, false, false);
            boolean ttff = booleanExpression(true, true, false, false);  // +
            boolean tttf = booleanExpression(true, true, true, false);
            boolean tttt = booleanExpression(true, true, true, true);
            boolean tftt = booleanExpression(true, false, true, true);
            boolean ttft = booleanExpression(true, true, false, true);
            boolean ftft = booleanExpression(false, true, false, true); // +
            boolean fttt = booleanExpression(false, true, true, true);
            System.out.println("ffff" + ffff);
            System.out.println("tfff" + tfff);
            System.out.println("ttff" + ttff);
            System.out.println("tttt" + tttt);
            System.out.println("tttf" + tttf);
            System.out.println("tftt" + tftt);
            System.out.println("ttft" + ttft);
            System.out.println("ftft" + ftft);
            System.out.println("fttt" + fttt);

        }
    }

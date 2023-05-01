package Smart;

public class SimpleCalculator {

    /**
     Write a function that does the following for the given values: add, subtract, divide and multiply
     */

    public static int operation(String a, String b, String op) {
        int result = 0;
        int aInt = Integer.parseInt(a);
        int bInt = Integer.parseInt(b);

        if (op.equals("add")) {
            result = Integer.sum(aInt, bInt);
        }
        if (op.equals("subtract")) {
            result = Math.subtractExact(aInt, bInt);
        }
        if (op.equals("divide")) {
            if (bInt == 0) {
                result = Integer.MIN_VALUE;
            }
            else result = Integer.divideUnsigned(aInt,bInt);
        }
        if (op.equals("multiply")) {
            result = Math.multiplyExact(aInt, bInt);
        }
        else {
            System.out.println("add correct operation");
        }
        return result;
    }

}

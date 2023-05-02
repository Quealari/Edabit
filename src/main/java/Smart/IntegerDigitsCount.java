package Smart;

public class IntegerDigitsCount {

    public static int count(int n) {
        // your recursive solution in here
        char[] chars = String.valueOf(n).toCharArray();
        return chars.length;
    }


    public static int countOne(int n) {
        return Math.abs(n) < 10 ? 1 : 1 + countOne(n/10);
    }

    public static int countTwo(int t) {
        if (Math.abs(t) < 10)
            return 1;
        else return 1 + countTwo(t/10);
    }

    public static void main(String[] args) {
        System.out.println(IntegerDigitsCount.countOne(2000));
    }

}

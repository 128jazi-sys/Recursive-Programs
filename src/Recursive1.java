public class Recursive1 {

    public static void helper(int numOfDigits, int current) {
        int numlength = (current + "").length();
        if(numOfDigits == numlength) {
            System.out.println(current);
        }
        for(int i = (current%10) + 1; i <=9; i++){
            helper(numOfDigits, (current*10)+i);
        }
    }

    public static void recursiveOne (int n) {
        helper(n,0);
    }
}

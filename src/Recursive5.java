public class Recursive5 {
    public static int recursiveFive(double money, double price, int wrappersNeeded) {
        int bought = ((int) (money/price));
        return bought + helper(bought, wrappersNeeded);
    }
    public static int helper(int numWrappers, int conversionRate) {
        if(numWrappers < conversionRate) {
            return 0;
        }
        int extra = numWrappers/conversionRate;
        int leftover = numWrappers%conversionRate;
        return extra + helper(extra+leftover, conversionRate);
    }
}

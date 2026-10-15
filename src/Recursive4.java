public class Recursive4 {
    public static void recursiveFour(String s, int n, int left, int right) {
        if (s.length() == n) {
            if (left == right) {
                System.out.println(s);
            }
            return;
        }

        int pos = s.length();

        if (pos < n/2) {
            recursiveFour(s + "0",n,left, right);
            recursiveFour(s+"1", n, left+1, right);
        }
        else if (pos >= (n+1)/2) {
            recursiveFour(s + "0",n,left, right);
            recursiveFour(s + "1", n, left, right+1);
        }
        else {
            recursiveFour(s+"0", n, left, right);
            recursiveFour(s+"1", n, left, right);
        }
    }
}

public class Recursive2 {

    public static int recursiveTwo(int n, int m) {
        if(n==0) {
            return 0;
        }
        if (m==0) {
            return n;
        }
        return recursiveTwo(n-1, m) + recursiveTwo(n, m-1);
    }
}


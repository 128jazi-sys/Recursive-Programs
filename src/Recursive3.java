public class Recursive3 {
    public static void recursiveThree(int length, String startString) {
        if (length == startString.length()) {
            System.out.println(startString);
            return;
        }
        String last;
        if (startString.length() == 0) {
            last = "";
        }
        else {
            last = startString.substring(startString.length()-1);
        }
        recursiveThree(length, startString + "0");
        if (last.equals("0") || last.equals("")) {
            recursiveThree(length, startString + "1");
        }
    }
}

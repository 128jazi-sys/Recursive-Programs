public class Recursive4 {
    public static void recursiveFour(int size) {
        String number = "";
        int middle = size/2;
        if (size == number.length()) {
            System.out.println(number);
            return;
        }
        if (number.length() == 0) {
            number = number + ""
        }
        if (Integer.parseInt(number.substring(0, middle)) <
                Integer.parseInt(number.substring(middle)) && number.length() < size) {
            number = number + "1";
            recursiveFour((number).length());
        }
        else if (Integer.parseInt(number.substring(0, middle)) >
                Integer.parseInt(number.substring(middle)) && number.length() < size) {
            number = number + "0";
            recursiveFour((number).length());
        }

    }
}

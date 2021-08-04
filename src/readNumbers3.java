import java.util.Scanner;

public class readNumbers3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Please pick a number");
        number = sc.nextInt();

        String stringNumber = "";

        if (number < 10) {
            stringNumber = "00" + number;
        } else if (number < 100) {
            stringNumber = "0" + number;
        } else if (number < 1000) {
            stringNumber = String.valueOf(number);
        }

        int specialCase = Character.getNumericValue(stringNumber.charAt(1));

        String word = "";

        switch (stringNumber.charAt(0)) {
            case '0':
                word += "";
                break;
            case '1':
                word += "one hundred ";
                break;
            case '2':
                word += "two hundred ";
                break;
            case '3':
                word += "three hundred ";
                break;
            case '4':
                word += "four hundred ";
                break;
            case '5':
                word += "five hundred ";
                break;
            case '6':
                word += "six hundred ";
                break;
            case '7':
                word += "seven hundred ";
                break;
            case '8':
                word += "eight hundred ";
                break;
            case '9':
                word += "nine hundred ";
                break;
        }

        if (number > 100) {
            word += "and ";
        }

        if (number > 10 && specialCase == 1) {
            switch (stringNumber.substring(1, 3)) {
                case "11":
                    word += "eleven";
                    break;
                case "12":
                    word += "twelve";
                    break;
                case "13":
                    word += "thirteen";
                    break;
                case "14":
                    word += "fourteen";
                    break;
                case "15":
                    word += "fifteen";
                    break;
                case "16":
                    word += "sixteen";
                    break;
                case "17":
                    word += "seventeen";
                    break;
                case "18":
                    word += "eighteen";
                    break;
                case "19":
                    word += "nineteen";
                    break;
            }
        } else {
            switch (stringNumber.charAt(1)) {
                case '0':
                    word += "";
                    break;

                case '2':
                    word += "twenty ";
                    break;
                case '3':
                    word += "thirty ";
                    break;
                case '4':
                    word += "fourty ";
                    break;
                case '5':
                    word += "fifty ";
                    break;
                case '6':
                    word += "sixty ";
                    break;
                case '7':
                    word += "seventy ";
                    break;
                case '8':
                    word += "eighty ";
                    break;
                case '9':
                    word += "ninety ";
                    break;
            }
            switch (stringNumber.charAt(2)) {
                case '0':
                    word += "zero";
                    break;
                case '1':
                    word += "one";
                    break;
                case '2':
                    word += "two";
                    break;
                case '3':
                    word += "three";
                    break;
                case '4':
                    word += "four";
                    break;
                case '5':
                    word += "five";
                    break;
                case '6':
                    word += "six";
                    break;
                case '7':
                    word += "seven";
                    break;
                case '8':
                    word += "eight";
                    break;
                case '9':
                    word += "nine";
                    break;
            }
        }

        System.out.println(word);
    }
}

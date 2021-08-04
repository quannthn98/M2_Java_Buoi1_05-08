import java.util.Scanner;

public class readNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;

        boolean canRead = false;

        System.out.println("Please in put number you want to read");
        number = sc.nextInt();

//        if (number < 0 || number > 999) {
//            System.out.println("This number can not be read");
//        } else {
//            canRead = true;
//        }
        String word = "";
//        String sNumber = number + "";
//        char charNum1 = sNumber.charAt(0);
//        char charNum2 = sNumber.charAt(1);
//        char charNum3 = sNumber.charAt(2);
//        String word1 ="";
//        String word2 ="";
//        String word3 = "";
        if (number <= 10) {
            switch (number) {
                case 1:
                    word = "one";
                    break;
                case 2:
                    word = "two";
                    break;

                case 3:
                    word = "threa";
                    break;

                case 4:
                    word = "four";
                    break;

                case 5:
                    word = "five";
                    break;

                case 6:
                    word = "six";
                    break;

                case 7:
                    word = "seven";
                    break;

                case 8:
                    word = "eight";
                    break;

                case 9:
                    word = "nine";
                    break;
                case 10:
                    word = "ten";
                    break;
                default:
                    word = "undefined";
                    break;
            }

        } else if (number <= 20) {
            switch (number) {
                case 11:
                    word = "eleven";
                    break;
                case 12:
                    word = "twelve";
                    break;
                case 13:
                    word = "thirteen";
                    break;
                case 14:
                    word = "fourteen";
                    break;
                case 15:
                    word = "fifteen";
                    break;
                case 16:
                    word = "sixteen";
                    break;
                case 17:
                    word = "seventeen";
                    break;
                case 18:
                    word = "eighteen";
                    break;
                case 19:
                    word = "nineteen";
                    break;
                case 20:
                    word = "twenty";
                    break;
                default:
                    word = "undefined";
                    break;
            }
        } else if (number <= 100) {
            String sNumber = number + "";
            char charNum1 = sNumber.charAt(0);
            char charNum2 = sNumber.charAt(1);
            String word1 ="";
            String word2 ="";
            switch (charNum1) {
                case '2':
                    word1 = "twenty";
                    break;
                case '3':
                    word1 = "thirty";
                    break;
                case '4':
                    word1 = "fourty";
                    break;
                case '5':
                    word1 = "fifty";
                    break;
                case '6':
                    word1 = "sixty";
                    break;
                case '7':
                    word1 = "seventy";
                    break;
                case '8':
                    word1 = "eighty";
                    break;
                case '9':
                    word1 = "ninety";
                    break;
                default:
                    word1 = "undefied";
                    break;
            }
            switch (charNum2) {
                case '1':
                    word2 = "one";
                    break;
                case '2':
                    word2 = "two";
                    break;

                case '3':
                    word2 = "threa";
                    break;

                case '4':
                    word2 = "four";
                    break;

                case '5':
                    word2 = "five";
                    break;

                case '6':
                    word2 = "six";
                    break;

                case '7':
                    word2 = "seven";
                    break;

                case '8':
                    word2 = "eight";
                    break;

                case '9':
                    word2 = "nine";
                    break;
                default:
                    word2 = "undefinded";
                    break;
            }
            word = word1 + word2;
        } else if (number < 1000) {
            String sNumber = number + "";
            char charNum1 = sNumber.charAt(0);
            char charNum2 = sNumber.charAt(1);
            char charNum3 = sNumber.charAt(2);
            String word1 ="";
            String word2 ="";
            String word3 = "";
            switch (charNum1) {
                case '1':
                    word1 = "one";
                    break;
                case '2':
                    word1 = "two";
                    break;
                case '3':
                    word1 = "three";
                    break;
                case '4':
                    word1 = "four";
                    break;
                case '5':
                    word1 = "five";
                    break;
                case '6':
                    word1 = "six";
                    break;
                case '7':
                    word1 = "seven";
                    break;
                case '8':
                    word1 = "eight";
                    break;
                case '9':
                    word1 = "nine";
                    break;
                default:
                    word1 = "undefined";
                    break;

            }
            switch (charNum2) {
                case '0':
                    word2 = "and";
                    break;

                case '2':
                    word2 = "twenty";
                    break;
                case '3':
                    word2 = "thirty";
                    break;
                case '4':
                    word2 = "fourty";
                    break;
                case '5':
                    word2 = "fifty";
                    break;
                case '6':
                    word2 = "sixty";
                    break;
                case '7':
                    word2 = "seventy";
                    break;
                case '8':
                    word2 = "eighty";
                    break;
                case '9':
                    word2 = "ninety";
                    break;
                default:
                    word2 = "undefied";
                    break;
            }
            switch (charNum3){
                case '1':
                    word3 = "one";
                    break;
                case '2':
                    word3 = "two";
                    break;
                case '3':
                    word3 = "three";
                    break;
                case '4':
                    word3 = "four";
                    break;
                case '5':
                    word3 = "five";
                    break;
                case '6':
                    word3 = "six";
                    break;
                case '7':
                    word3 = "seven";
                    break;
                case '8':
                    word3 = "eight";
                    break;
                case '9':
                    word3 = "nine";
                    break;
                default:
                    word3 = "undefied";
                    break;
            }
            word = word + word1 + " hundred and " + word2 + " " + word3;
        }
        System.out.println(word);
    }
}

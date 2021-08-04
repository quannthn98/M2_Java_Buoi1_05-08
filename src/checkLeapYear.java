import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        boolean isLeapYear;
        System.out.println("Moi ban nhap vao Nam muon kiem tra");
        year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        if (isLeapYear){
            System.out.println(year + "Is leap year");
        } else {
            System.out.println(year + "Is not leap year");
        }
    }
}

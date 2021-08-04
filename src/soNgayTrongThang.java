import java.util.Scanner;

public class soNgayTrongThang {
    public static void main(String[] args) {
        int dateNum;
        int month;
        System.out.println("Nhập vào tháng để xem số ngày trong tháng đó");
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        if (month > 12 || month < 0){
            System.out.println(" mời bạn nhập lại số từ 0-12");
            month = sc.nextInt();
        }
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dateNum = 31;
                break;
            case 2:
                dateNum = 28;
                break;
            default:
                dateNum = 30;
               break;
        }
        System.out.println("Tháng " + month + " có " + dateNum + " ngày");

    }
}

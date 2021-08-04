import java.util.Scanner;

public class giaiPTBacNhat {
    public static void main(String[] args) {
        double a;
        double b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac nhat, moi ban nhap vao 3 gia tri a, b, c");
        System.out.println("Nhap vao a");
        a = sc.nextInt();
        System.out.println("Nhap vao b");
        b = sc.nextInt();
        System.out.println("Đang giải toán");
        if (a == 0) {
            if (b == 0) {
                System.out.println("PT có vô số nghiệm");
            } else {
                System.out.println("PT vô nghiệm");
            }
        } else {
            double root = (-b) / a;
            System.out.println("Có nghiệm là: " + root);
        }
    }
}

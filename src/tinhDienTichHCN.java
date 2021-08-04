import java.util.Scanner;

public class tinhDienTichHCN {
    public static void main(String[] args) {
        int width;
        int height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao chieu rong");
        width = sc.nextInt();
        System.out.printf("Nhap vao chieu cao");
        height = sc.nextInt();
        int area = width * height;
        System.out.println("dien tich la: " + area);
    }
}

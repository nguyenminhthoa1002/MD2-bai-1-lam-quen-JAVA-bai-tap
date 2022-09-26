import java.util.Scanner;

public class chuyenDoiTienTe {
    public static void main(String[] args) {
        System.out.println("Convert USD to VND");
        System.out.println("Enter the amount of USD");
        Scanner scanner = new Scanner(System.in);
        double amountUSD = scanner.nextDouble();
        double convertToVND = amountUSD*23000;
        System.out.printf("VND = %.2f\n",convertToVND);

        System.out.println("Convert VND to USD");
        System.out.println("Enter the amount of VND");
        double amountVND = scanner.nextDouble();
        double convertToUSD = amountVND/23000;
        System.out.printf("USD = %.2f",convertToUSD);
    }
}

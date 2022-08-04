import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        double money =1;
        int month = 1;
        double interestRate = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhap so tien : ");
        money = input.nextDouble();
        System.out.println("Nhap so thang : ");
        month = input.nextInt();
        System.out.println("Nhap lai suat : ");
        interestRate = input.nextDouble();

        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest = totalInterest + money*(interestRate/100)/12*month;
        }
        System.out.println( "Tong tien lai sau " + month + " thang la : " + totalInterest);
    }
}

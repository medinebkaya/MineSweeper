import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,column;
        System.out.println("Mayın Tarlasına hoşgeldiniz.");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz: ");
        System.out.print("Satır sayısı: ");
        row=scan.nextInt();
        System.out.print("Sütun Sayısı: ");
        column=scan.nextInt();

        MineSweeper mayin=new MineSweeper(row,column);
        mayin.run();

    }
}

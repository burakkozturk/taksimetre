import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar , km;

        Scanner input = new Scanner(System.in);
        System.out.println("Gidilen Km giriniz :");
        km = input.nextInt();
        tutar = 10 + (km*2.20);

        // boolean b = (tutar < 20) ? tutar == 20 : tutar == tutar;

        boolean kacTl = tutar >20;

        double sorgu = (kacTl) ? tutar : 20;
        System.out.print("Ödenecek Tutar : " +sorgu);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму для пополнения баланса: ");

        int summ = scanner.nextInt();

        if (summ > 1000) {
            int sto = (int) (summ - 1000);
            int bonus = (int) (sto / 100);
            summ = (summ + bonus);
            System.out.println("Ваш баланс:" + " " + summ);
        } else {
            System.out.println("Ваш баланс:" + " " + summ);
        }
    }
}

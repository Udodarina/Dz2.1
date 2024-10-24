import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите сумму для пополнения баланса: ");

        Scanner input = new Scanner(System.in);
        int summ = input.nextInt();

        if (summ > 1000) {
            int hundred = (int) (summ - 1000);
            int bonus = (int) (hundred / 100);
            summ = (summ + bonus);
            System.out.println("Ваш баланс:" + summ);
        } else {
            System.out.println("Ваш баланс:" + summ);
        }
    }
}

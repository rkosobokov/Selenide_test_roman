import java.util.Scanner;

public class BankDepositFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();

        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();

        for (int i = 0; i < months; i++) {
            deposit = deposit + (deposit * 0.07f); // Начисляем 7% каждый месяц
        }

        System.out.printf("Итоговая сумма с учетом процентов: %f", deposit);
    }
}
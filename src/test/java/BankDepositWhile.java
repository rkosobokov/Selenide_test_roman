import java.util.Scanner;

public class BankDepositWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();

        System.out.print("Введите количество месяцев: ");
        int months = scanner.nextInt();

        int currentMonth = 0;
        while (currentMonth < months) {
            deposit = deposit + (deposit * 0.07f); // Начисляем 7% каждый месяц
            currentMonth++;
        }

        System.out.printf("Итоговая сумма с учетом процентов: %.5f", deposit);
    }
}
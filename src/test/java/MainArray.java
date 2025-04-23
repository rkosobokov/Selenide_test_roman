import java.util.Random;

public class MainArray {
    public static void main(String[] args) {
        // Создаем массив
        String[] strings = {"привет", "ПОКА", "гипербола"};

        // Случайное число
        Random random = new Random();
        int randomIndex = random.nextInt(3); // рандом из 3х

        // Выводим случайно выбранную строку
        System.out.println("Случайно выбранная строка: " + strings[randomIndex]);

        // Выводим 1ю строку в верхнем регистре
        String firstUpper = strings[0].toUpperCase();
        System.out.println(firstUpper);

        // Выводим 2ю строку в нижнем регистре
        String secondLower = strings[1].toLowerCase();
        System.out.println(secondLower);

        // Ищем строку, где вторая буква - русская "О" и вставляем пробел после 3ей буквы
        for (String str : strings) {
            if (str.length() >= 4) {  // Проверяем, что строка достаточно длинная
                char secondChar = str.charAt(1);
                if (secondChar == 'О') {  // Проверяем "О"
                    StringBuilder sb = new StringBuilder(str);
                    sb.insert(3, ' ');  // Вставляем пробел между 3 и 4 буквой
                    System.out.println(sb.toString());
                    break;
                }
            }
        }
    }
}
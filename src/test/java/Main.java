public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса
        MyClass obj = new MyClass();

        // Переопределяем публичные переменные
        obj.publicVar1 = 10;
        obj.publicVar2 = "Hello";

        // Переопределяем статичную переменную
        MyClass.staticVar = 20;

        // Выводим значения переменных
        System.out.println("publicVar1: " + obj.publicVar1);
        System.out.println("publicVar2: " + obj.publicVar2);

        // Используем метод, который работает со статичной переменной
        obj.printStaticVar();
    }
}
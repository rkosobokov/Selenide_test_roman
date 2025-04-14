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
       // System.out.println("staticVar3: " + obj.staticVar);


        // Используем метод, который работает со статичной переменной
        // obj.printStaticVar();
        // for повторяет метод 10 раз
        for (int i = 0; i < 3; i++) {
            obj.printStaticVar();
        }

    }
}
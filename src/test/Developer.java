public class Developer extends Employee {
    public Developer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.printf("%s (разработчик) пишет код. Зарплата: %,.2f руб.",
                getName(), getSalary());
    }

    public static void main(String[] args) {
        Developer dev = new Developer("Петр Семенов", 95000);
        dev.work();
    }
}
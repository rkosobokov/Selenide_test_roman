public class Manager extends Employee {
    public Manager(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.printf("%s (менеджер) управляет проектами. Зарплата: %,.2f руб.",
                getName(), getSalary());
    }

    public static void main(String[] args) {
        Manager mgr = new Manager("Анна Козлова", 135000);
        mgr.work();
    }
}
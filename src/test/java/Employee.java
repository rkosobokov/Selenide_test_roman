public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work() {
        System.out.printf("%s (сотрудник) выполняет базовые задачи. Зарплата: %,.2f руб.%n",
                name, salary);
    }

    // Геттеры
    public String getName() { return name; }
    public double getSalary() { return salary; }
}
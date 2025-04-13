public class Car3 {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Lada Granta";
        car.year = 2018;
        car.beepCount = 4;  // Будет бибикнуть 4 раза

        System.out.println("=== Car3 ===");
        car.makeBeBe();
    }
}
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Нарисован круг");
    }

    public static void main(String[] args) {
        new Circle().draw();
    }
}
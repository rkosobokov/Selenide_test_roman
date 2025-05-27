public class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Нарисован прямоугольник");
    }

    public static void main(String[] args) {
        new Rectangle().draw();
    }
}
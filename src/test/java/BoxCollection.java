import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BoxCollection {
    public static void main(String[] args) {
        Collection<Box> boxes = new ArrayList<>();

        // Добавим несколько коробок в коллекцию
        boxes.add(new Box(20, 15, 10));
        boxes.add(new Box(35, 20, 25));
        boxes.add(new Box(40, 30, 30));
        boxes.add(new Box(25, 20, 15));

        // Коллекция для коробок с шириной больше 30 см
        Collection<Box> largeBoxes = filterBoxes(boxes);

        // Выводим отфильтрованные коробки
        System.out.println("Коробки с шириной больше 30 см:");
        for (Box box : largeBoxes) {
            System.out.println(box);
        }
    }

    public static Collection<Box> filterBoxes(Collection<Box> boxes) {
        Collection<Box> largeBoxes = new ArrayList<>();
        Iterator<Box> iterator = boxes.iterator();

        while (iterator.hasNext()) {
            Box box = iterator.next();
            if (box.getWidth() > 30) {
                largeBoxes.add(box);
            }
        }

        return largeBoxes;
    }
}

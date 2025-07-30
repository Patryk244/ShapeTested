import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Square;
import com.kodilla.testing.shape.Triangle;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeCollectorTestSuite {

    public static ShapeCollector collector;

    @BeforeEach
    public void setUp() {
        collector = new ShapeCollector();
    }

    @Nested
    @DisplayName("Test for shape")
    class TestShape {

        @Test
        public void createCircle() {
            Circle circle = new Circle();
            assertEquals("Circle", circle.getShapeName());
        }

        @Test
        public void createSquare() {
            Square square = new Square();
            assertEquals("Square", square.getShapeName());
        }

        @Test
        public void createTriangle() {
            Triangle triangle = new Triangle();
            assertEquals("Triangle", triangle.getShapeName());
        }
    }

    @Nested
    @DisplayName("Test collector")
    class testCollector {

        @Test
        @DisplayName("Add figure to list.")
        public void addShape() {
            collector.addFigure(new Circle());
            Assertions.assertEquals(1, collector.sizeList());
        }

        @Test
        @DisplayName("Remove figure to list.")
        public void removeShape() {
            Circle circle = new Circle();
            collector.addFigure(circle);

            boolean result = collector.removeFigure(circle);

            Assertions.assertFalse(result);
        }

        @Test
        @DisplayName("Display all element which includes in list")
        public void showAllElement() {
            collector.addFigure(new Circle());
            collector.addFigure(new Triangle());
            collector.addFigure(new Square());

            String names = collector.showFigure();

            assertEquals("Circle Triangle Square", names);

        }
    }

}

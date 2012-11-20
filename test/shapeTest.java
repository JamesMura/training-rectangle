import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class shapeTest {

    private Shape rectangle;
    private Shape square;

    @Before
    public void setUp() throws Exception {
        rectangle = Shape.getRectangle(1, 2);
        square = Shape.getSquare(2);
    }

    @Test
    public void shouldCalculateAreaOfARectangle() {
        assertThat(rectangle.area(), is(2));
    }

    @Test
    public void shouldCalculateThePerimeterOfARectangle() {
        assertThat(rectangle.perimeter(), is(6));
    }

    @Test
    public void shouldCalculateTheAreaOfASquare() {
        assertThat(square.area(), is(4));
    }

    @Test
    public void shouldCalculateThePerimeterOfASquare() {
        assertThat(square.perimeter(), is(8));
    }

}

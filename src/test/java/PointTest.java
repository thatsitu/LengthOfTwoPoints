import com.vapasi.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {


    @Test
    public void shouldReturnLengthBetweenTwoPoints(){
        Point p1 = new Point(3,4);
        Point p2 = new Point(4,3);
        double actualLength = p1.distance(p2);
        assertEquals(1.41,actualLength);


    }

}

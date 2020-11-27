import com.vapasi.Line;
import com.vapasi.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

    @Test
    public void shouldReturnEqualIfTwoEndPointsAreEqual(){
        Line l1 = new Line();
        Line l2 = new Line();
        boolean actualLength = l1.equals(l2);
        assertEquals(true,actualLength);


    }
}

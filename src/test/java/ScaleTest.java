import org.example.affineTransform.scale.Scale;
import org.example.math.vector.Vector3f;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScaleTest {
    @Test
    void doScaleVectorOne(){
        Vector3f vActual = new Vector3f(1f, 2f, 3f);
        Scale scale = new Scale(1f, 2f, 3f);
        Vector3f vExpected = scale.doScale(new Vector3f(1f, 1f, 1f));
        assertEquals(vExpected, vActual);
    }
    @Test
    void doScaleCoeffOne(){
        Vector3f vActual = new Vector3f(-124f, -248f, 3f);
        Scale scale = new Scale(-124f, -124f, 1f);
        Vector3f vExpected = scale.doScale(1f, 2f, 3f);
        assertEquals(vExpected, vActual);
    }

    @Test
    void doScaleVectorTwo(){
        Vector3f vActual = new Vector3f(5f, 5f, 5f);
        Scale scale = new Scale(5);
        Vector3f vExpected = scale.doScale(new Vector3f(1f, 1f, 1f));
        assertEquals(vExpected, vActual);
    }
    @Test
    void doScaleCoeffTwo(){
        Vector3f vActual = new Vector3f(-25f, 125f, -625f);
        Scale scale = new Scale(5);
        Vector3f vExpected = scale.doScale(-5f, 25f, -125f);
        assertEquals(vExpected, vActual);
    }
    @Test
    void doScaleVectorThree(){
        Vector3f vActual = new Vector3f(1f, 25f, -0.5f);
        Scale scale = new Scale(0.1f, 0.2f, -0.5f);
        Vector3f vExpected = scale.doScale(new Vector3f(10f, 125f, 1f));
        assertEquals(vExpected, vActual);
    }
    @Test
    void doScaleCoeffThree(){
        Vector3f vActual = new Vector3f(2.5f, -2f, 3.5f);
        Scale scale = new Scale(-0.5f);
        Vector3f vExpected = scale.doScale(-5f, 4f, -7f);
        assertEquals(vExpected, vActual);
    }
}

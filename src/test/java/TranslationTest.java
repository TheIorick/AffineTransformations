import org.example.affineTransform.scale.Scale;
import org.example.affineTransform.translation.Translation;
import org.example.math.vector.Vector3f;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TranslationTest {
    @Test
    void doTranslateVectorOne(){
        Vector3f vActual = new Vector3f(2f, 3f, 4f);
        Translation translation = new Translation(1f, 2f, 3f);
        Vector3f vExpected = translation.doTranslation(new Vector3f(1f, 1f, 1f));
        assertEquals(vExpected, vActual);
    }

    @Test
    void doTranslateCoeffOne(){
        Vector3f vActual = new Vector3f(0, -1.5f, -2.7f);
        Translation translation = new Translation(-1f, -2.5f, -3.7f);
        Vector3f vExpected = translation.doTranslation(1f, 1f, 1f);
        assertEquals(vExpected, vActual);
    }
}

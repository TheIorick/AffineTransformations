import org.example.affineTransform.rotation.Rotation;
import org.example.math.matrix.Matrix4f;
import org.example.math.vector.Vector3f;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RotationTest {
    @Test
    void doRotationAroundXTestCoeff(){
        Vector3f vActual = new Vector3f(1, 0, (float) Math.sqrt(2));
        Rotation rotationX = new Rotation();
        rotationX.setRotationAroundX(45, true);
        Vector3f vExpected = rotationX.doRotation(1f, 1f, 1f);
        assertEquals(vExpected, vActual);
    }
    @Test
    void doRotationAroundXTestVector(){
        Vector3f vActual = new Vector3f(1, (float) Math.sqrt(2), 0);
        Rotation rotationX = new Rotation();
        rotationX.setRotationAroundX(45, false);
        Vector3f vExpected = rotationX.doRotation(new Vector3f(1f, 1f, 1f));
        assertEquals(vExpected, vActual);
    }
    @Test
    void doRotationAroundYTestVector(){
        Vector3f vActual = new Vector3f(1f, 1f, 1f);
        Rotation rotationY = new Rotation();
        rotationY.setRotationAroundY(0, false);
        Vector3f vExpected = rotationY.doRotation(new Vector3f(1f, 1f, 1f));
        assertEquals(vExpected, vActual);
    }
    @Test
    void doRotationAroundYTestCoeff(){
        Vector3f vActual = new Vector3f(-1f, 1f, 1f);
        Rotation rotationY = new Rotation();
        rotationY.setRotationAroundY(90, true);
        Vector3f vExpected = rotationY.doRotation(1f, 1f, 1f);
        assertEquals(vExpected, vActual);
    }

    @Test
    void doRotationAroundZTestVector(){
        Vector3f vActual = new Vector3f((float) ((Math.sqrt(3) - 1)/2.0f), (float) ((Math.sqrt(3) + 1)/2.0f), 1f);
        Rotation rotationZ = new Rotation();
        rotationZ.setRotationAroundZ(30, true);
        Vector3f vExpected = rotationZ.doRotation(new Vector3f(1f, 1f, 1f));
        assertEquals(vExpected, vActual);
    }

    @Test
    void doRotationAroundZTestCoeff(){
        Vector3f vActual = new Vector3f((float) ((Math.sqrt(3) + 1)/2.0f), (float) ((-Math.sqrt(3) + 1)/2.0f), 1f);
        Rotation rotationZ = new Rotation();
        rotationZ.setRotationAroundZ(60, false);
        Vector3f vExpected = rotationZ.doRotation(new Vector3f(1f, 1f, 1f));
        assertEquals(vExpected, vActual);
    }

    @Test
    void doRotationAroundXY(){
        Vector3f vActual = new Vector3f(0f, (float) (Math.sqrt(2)/2 - 1), (float) (Math.sqrt(2)/2 + 1));

        Rotation rotationY = new Rotation();
        rotationY.setRotationAroundY(45, true);

        Rotation rotationX = new Rotation();
        rotationX.setRotationAroundX(45, true);

        Rotation rotationXY = Rotation.setRotation(rotationX, rotationY);
        Vector3f vExpected = rotationXY.doRotation(1f, 1f, 1f);

        assertEquals(vExpected, vActual);
    }
    @Test
    void doRotationAroundXYZ(){
        Vector3f vActual = new Vector3f(0f, (float) (Math.sqrt(2)/2 - 1), (float) (Math.sqrt(2)/2 + 1));

        Rotation rotationY = new Rotation();
        rotationY.setRotationAroundY(45, true);

        Rotation rotationX = new Rotation();
        rotationX.setRotationAroundX(45, true);

        Rotation rotationZ = new Rotation();
        rotationX.setRotationAroundZ(45, true);

        Rotation rotationXY = Rotation.setRotation(rotationX, rotationY);
        Rotation rotationXYZ = Rotation.setRotation(rotationZ, rotationXY);
        Vector3f vExpected = rotationXYZ.doRotation(1f, 1f, 1f);

        assertEquals(vExpected, vActual);
    }
}

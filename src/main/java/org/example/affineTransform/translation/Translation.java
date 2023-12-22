package org.example.affineTransform.translation;

import org.example.math.matrix.Matrix4f;
import org.example.math.vector.Vector3f;
import org.example.math.vector.Vector4f;

public class Translation {
    public final Matrix4f tr = new Matrix4f();
    public static final int M11 = 0;
    public static final int M12 = 4;
    public static final int M13 = 8;
    public static final int M14 = 12;
    public static final int M21 = 1;
    public static final int M22 = 5;
    public static final int M23 = 9;
    public static final int M24 = 13;
    public static final int M31 = 2;
    public static final int M32 = 6;
    public static final int M33 = 10;
    public static final int M34 = 14;
    public static final int M41 = 3;
    public static final int M42 = 7;
    public static final int M43 = 11;
    public static final int M44 = 15;
    public static final int LEN = 16;

    public Translation(float tX, float tY, float tZ) {
        setTranslationMatrix(tX, tY, tZ);
    }

    public void setTranslationMatrix(float tX, float tY, float tZ){
        float values[] = new float[LEN];
        values[M11] = 1f; values[M12] = 0f; values[M13] = 0f; values[M14] = tX;
        values[M21] = 0f; values[M22] = 1f; values[M23] = 0; values[M24] = tY;
        values[M31] = 0f; values[M32] = 0; values[M33] = 1f; values[M34] = tZ;
        values[M41] = 0f; values[M42] = 0f; values[M43] = 0f; values[M44] = 1f;
        tr.set(values);
    }

    public Vector3f doTranslation(float x, float y, float z) {
        Vector4f v4 = new Vector4f(x, y, z, 1.0f);
        Vector4f afterTranslation = tr.mul(v4);
        return new Vector3f(afterTranslation);
    }

    public Vector3f doTranslation(Vector3f v) {
        Vector4f v4 = new Vector4f(v, 1.0f);
        Vector4f afterTranslation = tr.mul(v4);
        return new Vector3f(afterTranslation);
    }
}

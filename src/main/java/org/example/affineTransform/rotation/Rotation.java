package org.example.affineTransform.rotation;

import org.example.math.matrix.Matrix4f;
import org.example.math.vector.Vector3f;
import org.example.math.vector.Vector4f;

public class Rotation implements InterfaceRotation{
    public Matrix4f r = new Matrix4f();
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
    @Override
    public void setRotationAroundX(double angle, boolean direction) {
        double angleRad =  Math.toRadians(angle);
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);
        if (direction){
            float[] values = new float[LEN];
            values[M11] = 1f; values[M12] = 0f; values[M13] = 0f; values[M14] = 0f;
            values[M21] = 0f; values[M22] = cos; values[M23] = -sin; values[M24] = 0f;
            values[M31] = 0f; values[M32] = sin; values[M33] = cos; values[M34] = 0f;
            values[M41] = 0f; values[M42] = 0f; values[M43] = 0f; values[M44] = 1f;
            r.set(values);
        } else {
            float[] values = new float[LEN];
            values[M11] = 1f; values[M12] = 0f; values[M13] = 0f; values[M14] = 0f;
            values[M21] = 0f; values[M22] = cos; values[M23] = sin; values[M24] = 0f;
            values[M31] = 0f; values[M32] = -sin; values[M33] = cos; values[M34] = 0f;
            values[M41] = 0f; values[M42] = 0f; values[M43] = 0f; values[M44] = 1f;
            r.set(values);
        }
    }

    @Override
    public void setRotationAroundY(double angle, boolean direction) {
        double angleRad =  Math.toRadians(angle);
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);
        if (direction){
            float[] values = new float[LEN];
            values[M11] = cos; values[M12] = 0f; values[M13] = -sin; values[M14] = 0f;
            values[M21] = 0f; values[M22] = 1f; values[M23] = 0f; values[M24] = 0f;
            values[M31] = sin; values[M32] = 0f; values[M33] = cos; values[M34] = 0f;
            values[M41] = 0f; values[M42] = 0f; values[M43] = 0f; values[M44] = 1f;
            r.set(values);
        } else {
            float[] values = new float[LEN];
            values[M11] = cos; values[M12] = 0f; values[M13] = sin; values[M14] = 0f;
            values[M21] = 0f; values[M22] = 1f; values[M23] = 0f; values[M24] = 0f;
            values[M31] = -sin; values[M32] = 0f; values[M33] = cos; values[M34] = 0f;
            values[M41] = 0f; values[M42] = 0f; values[M43] = 0f; values[M44] = 1f;
            r.set(values);
        }
    }

    @Override
    public void setRotationAroundZ(double angle, boolean direction) {
        double angleRad =  Math.toRadians(angle);
        float cos = (float) Math.cos(angleRad);
        float sin = (float) Math.sin(angleRad);
        if (direction){
            float[] values = new float[LEN];
            values[M11] = cos; values[M12] = -sin; values[M13] = 0f; values[M14] = 0f;
            values[M21] = sin; values[M22] = cos; values[M23] = 0f; values[M24] = 0f;
            values[M31] = 0f; values[M32] = 0f; values[M33] = 1f; values[M34] = 0f;
            values[M41] = 0f; values[M42] = 0f; values[M43] = 0f; values[M44] = 1f;
            r.set(values);
        } else {
            float[] values = new float[LEN];
            values[M11] = cos; values[M12] = sin; values[M13] = 0f; values[M14] = 0f;
            values[M21] = -sin; values[M22] = cos; values[M23] = 0f; values[M24] = 0f;
            values[M31] = 0f; values[M32] = 0f; values[M33] = 1f; values[M34] = 0f;
            values[M41] = 0f; values[M42] = 0f; values[M43] = 0f; values[M44] = 1f;
            r.set(values);
        }
    }

    public static Rotation setRotation(Rotation r1, Rotation r2){
        Rotation rNew = new Rotation();
        rNew.r = r1.r.mul(r2.r);
        return rNew;
    }

    @Override
    public Vector3f doRotation(float x, float y, float z) {
        Vector4f v4 = new Vector4f(x, y, z, 1.0f);
        Vector4f afterRotation = r.mul(v4);
        return new Vector3f(afterRotation);
    }

    @Override
    public Vector3f doRotation(Vector3f v) {
        Vector4f v4 = new Vector4f(v, 1.0f);
        Vector4f afterRotation = r.mul(v4);
        return new Vector3f(afterRotation);
    }
}

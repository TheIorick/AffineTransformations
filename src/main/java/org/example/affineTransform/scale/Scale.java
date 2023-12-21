package org.example.affineTransform.scale;

import org.example.math.matrix.Matrix4f;
import org.example.math.vector.Vector3f;
import org.example.math.vector.Vector4f;

public class Scale implements InterfaceScale {
    public final Matrix4f scale = new Matrix4f();

    public Scale(float scaleX, float scaleY, float scaleZ) {
        setScaleMatrix(scaleX, scaleY, scaleZ);
    }

    public Scale(float scaleS) {
        setScaleMatrix(scaleS);
    }

    //todo можно сделать чтобы мы задавали коэф-ты для того чтобы сжать или отразить?
    @Override
    public void setScaleMatrix(float scaleX, float scaleY, float scaleZ) {
        float[] values = {scaleX, 0.0f, 0.0f, 0.0f, 0.0f, scaleY, 0.0f, 0.0f, 0.0f, 0.0f, scaleZ, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        scale.set(values);
    }

    @Override
    public void setScaleMatrix(float scaleS) {
        float[] values = {scaleS, 0.0f, 0.0f, 0.0f, 0.0f, scaleS, 0.0f, 0.0f, 0.0f, 0.0f, scaleS, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        scale.set(values);
    }

    @Override
    public Vector3f doScale(float x, float y, float z) {
        Vector4f v4 = new Vector4f(x, y, z, 1.0f);
        Vector4f afterScale = scale.mul(v4);
        return new Vector3f(afterScale);
    }

    @Override
    public Vector3f doScale(Vector3f v) {
        Vector4f v4 = new Vector4f(v, 1.0f);
        Vector4f afterScale = scale.mul(v4);
        return new Vector3f(afterScale);
    }
}

package org.example.affineTransform.rotation;

import org.example.math.vector.Vector3f;

public interface InterfaceRotation {
    /**
     *
     * @param angle - угол
     * @param direction - направление поворота
     *                  Устанавливаем матрицу поворота вокруг одной оси
     */
    void setRotationAroundX(float angle, boolean direction);
    void setRotationAroundY(float angle, boolean direction);
    void setRotationAroundZ(float angle, boolean direction);

    /**
     * Совершаем поворот
     */
    Vector3f doRotation(float x, float y, float z);
    Vector3f doRotation(Vector3f v);
}

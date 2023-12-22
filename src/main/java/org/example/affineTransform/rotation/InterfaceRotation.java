package org.example.affineTransform.rotation;

import org.example.math.vector.Vector3f;

public interface InterfaceRotation {
    /**
     *
     * @param angle - угол
     * @param direction - направление поворота, true - против часовой, false - по
     *                  Устанавливаем матрицу поворота вокруг одной оси
     */

    void setRotationAroundX(double angle, boolean direction);

    void setRotationAroundY(double angle, boolean direction);

    void setRotationAroundZ(double angle, boolean direction);

    /**
     * Совершаем поворот
     */
    Vector3f doRotation(float x, float y, float z);
    Vector3f doRotation(Vector3f v);
}

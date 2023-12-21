package org.example.affineTransform.scale;

import org.example.math.vector.Vector3f;

public interface InterfaceScale {
    //Создаем 4хмерную матрицу из координат, координаты для всех осей разные
    void setScaleMatrix(float scaleX, float scaleY, float scaleZ);
    //координаты для всех осей одинаковые
    void setScaleMatrix(float scaleS);

    //Масштабирование по координатам
    Vector3f doScale(float x, float y, float z);
    //Масштабирование по вектору
    Vector3f doScale(Vector3f v);

}

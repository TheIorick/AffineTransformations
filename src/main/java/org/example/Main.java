package org.example;

import org.example.affineTransform.rotation.Rotation;
import org.example.math.vector.Vector2f;
import org.example.math.vector.Vector3f;

public class Main {
    public static void main(String[] args) {
        Vector3f vActual = new Vector3f(-1f, 1f, 1f);
        Rotation rotationY = new Rotation();
        rotationY.setRotationAroundX(90, true);
        Vector3f vExpected = rotationY.doRotation(1f, 1f, 1f);    }
}
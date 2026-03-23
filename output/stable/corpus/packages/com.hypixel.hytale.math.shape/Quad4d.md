# Quad4d

Type: class | Package: com.hypixel.hytale.math.shape

public class Quad4d

## Fields

- private Vector4d a
- private Vector4d b
- private Vector4d c
- private Vector4d d

## Methods

- this(points, 0, 1, 2, 3)
- this(points[a], points[b], points[c], points[d])
- public boolean isFullyInsideFrustum()
- public Vector4d getA()
- public Vector4d getB()
- public Vector4d getC()
- public Vector4d getD()
- public Vector4d get(int idx)
- > throw new IllegalArgumentException("Index must be in range of 0 to 3. Given: " + idx)
- public double getMin(int component)
- public double getMax(int component)
- @Nonnull public Quad2d to2d(@Nonnull Quad2d target)
- @Nonnull public Vector4d getCenter()
- @Nonnull public Vector4d getCenter(@Nonnull Vector4d target)
- public void perspectiveTransform()
- @Nonnull public Vector4d getRandom(@Nonnull Random random)
- @Nonnull public Vector4d getRandom(@Nonnull Random random, @Nonnull Vector4d target)
- @Override public String toString()

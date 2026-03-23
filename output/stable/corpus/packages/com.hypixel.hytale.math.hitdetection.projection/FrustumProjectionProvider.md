# FrustumProjectionProvider

Type: class | Package: com.hypixel.hytale.math.hitdetection.projection | Implements: MatrixProvider

public class FrustumProjectionProvider implements MatrixProvider

## Fields

- public static final BuilderCodec<FrustumProjectionProvider> CODEC
- protected final Matrix4d matrix
- protected final Matrix4d rotMatrix
- protected boolean invalid
- protected double left
- protected double right
- protected double bottom
- protected double top
- protected double near
- protected double far
- protected double yaw
- protected double pitch
- protected double roll

## Methods

- @Nonnull public FrustumProjectionProvider setLeft(double left)
- @Nonnull public FrustumProjectionProvider setRight(double right)
- @Nonnull public FrustumProjectionProvider setBottom(double bottom)
- @Nonnull public FrustumProjectionProvider setTop(double top)
- @Nonnull public FrustumProjectionProvider setNear(double near)
- @Nonnull public FrustumProjectionProvider setFar(double far)
- @Nonnull public FrustumProjectionProvider setRotation(double yaw, double pitch, double roll)
- @Override public Matrix4d getMatrix()

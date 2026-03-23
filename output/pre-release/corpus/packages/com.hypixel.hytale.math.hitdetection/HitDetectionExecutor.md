# HitDetectionExecutor

Type: class | Package: com.hypixel.hytale.math.hitdetection

public class HitDetectionExecutor

Class in the hitdetection subsystem.

## Fields

- projectionProvider | MatrixProvider | MatrixProvider field.
- viewProvider | MatrixProvider | MatrixProvider field.
- losProvider | LineOfSightProvider | LineOfSightProvider field.
- maxRayTests | int | int field.

## Methods

- getHitLocation() | Vector4d | public method.
- setProjectionProvider(MatrixProvider provider) | HitDetectionExecutor | public method.
- setViewProvider(MatrixProvider provider) | HitDetectionExecutor | public method.
- setLineOfSightProvider(LineOfSightProvider losProvider) | HitDetectionExecutor | public method.
- setMaxRayTests(int maxRayTests) | HitDetectionExecutor | public method.
- setOrigin(double x, double y, double z) | HitDetectionExecutor | public method.
- setupMatrices(@Nonnull Matrix4d modelMatrix) | void | private method.
- test(@Nonnull Vector4d point, @Nonnull Matrix4d modelMatrix) | boolean | public method.
- test(@Nonnull Quad4d[] model, @Nonnull Matrix4d modelMatrix) | boolean | public method.
- testPoint(@Nonnull Vector4d point) | boolean | private method.
- testModel(@Nonnull Quad4d[] model) | boolean | private method.
- insideFrustum() | boolean | protected method.
- clipPolygonAxis(int componentIndex) | boolean | private method.
- toString() | String | public method.

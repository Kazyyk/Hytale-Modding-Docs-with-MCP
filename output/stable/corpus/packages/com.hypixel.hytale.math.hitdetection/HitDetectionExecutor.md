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

Also in this package: HitDetectionBuffer, LineOfSightProvider, MatrixProvider, Vector4dBufferList

Complete API:
  public Vector4d getHitLocation()
  public HitDetectionExecutor setProjectionProvider(MatrixProvider provider)
  public HitDetectionExecutor setViewProvider(MatrixProvider provider)
  public HitDetectionExecutor setLineOfSightProvider(LineOfSightProvider losProvider)
  public HitDetectionExecutor setMaxRayTests(int maxRayTests)
  public HitDetectionExecutor setOrigin(double x, double y, double z)
  private void setupMatrices(Matrix4d modelMatrix)
  public boolean test(Vector4d point, Matrix4d modelMatrix)
  public boolean test(Quad4d[] model, Matrix4d modelMatrix)
  private boolean testPoint(Vector4d point)
  private boolean testModel(Quad4d[] model)
  protected boolean insideFrustum()
  private boolean clipPolygonAxis(int componentIndex)
  private static void clipPolygonComponent(Vector4dBufferList vertices, int componentIndex, double componentFactor, Vector4dBufferList result)
  public String toString()

Fields:
public static final HytaleLogger log
private static final Vector4d[] VERTEX_POINTS
public static final Quad4d[] CUBE_QUADS
private final Matrix4d pvmMatrix
private final Matrix4d invPvMatrix
private final Vector4d origin
private final HitDetectionBuffer buffer
private MatrixProvider projectionProvider
private MatrixProvider viewProvider
private LineOfSightProvider losProvider
private int maxRayTests

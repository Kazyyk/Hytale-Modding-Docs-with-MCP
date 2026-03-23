# AbstractDistortedShape

Type: class | Package: com.hypixel.hytale.server.worldgen.cave.shape.distorted | Extends: null | Implements: DistortedShape

public abstract class AbstractDistortedShape implements DistortedShape

## Fields

- private static final double PITCH_MIN
- private static final double PITCH_MAX
- private final int lowBoundX
- private final int lowBoundY
- private final int lowBoundZ
- private final int highBoundX
- private final int highBoundY
- private final int highBoundZ

## Constructors

- public AbstractDistortedShape(@Nonnull Vector3d o, double radiusX, double radiusY, double radiusZ)
- public AbstractDistortedShape(@Nonnull Vector3d o, @Nonnull Vector3d v, double width, double height)

## Methods

- public int getLowBoundX()
- public int getLowBoundZ()
- public int getHighBoundX()
- public int getHighBoundZ()
- public int getLowBoundY()
- public int getHighBoundY()
- public static double clampPitch(double pitch)

## Related Types

- DistortedShape

Known subclasses: AbstractDistortedBody, AbstractDistortedExtrusion

Also in this package: AbstractDistortedBody, AbstractDistortedExtrusion, DistortedCylinderShape, DistortedEllipsoidShape, DistortedPipeShape, DistortedShape, DistortedShapes, Factory, Factory, Factory, Factory, Factory, ShapeDistortion

Complete API:
  public int getLowBoundX()
  public int getLowBoundZ()
  public int getHighBoundX()
  public int getHighBoundZ()
  public int getLowBoundY()
  public int getHighBoundY()
  public static double clampPitch(double pitch)

Fields:
private static final double PITCH_MIN
private static final double PITCH_MAX
private final int lowBoundX
private final int lowBoundY
private final int lowBoundZ
private final int highBoundX
private final int highBoundY
private final int highBoundZ

# Bounds3d

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.bounds | Implements: MemInstrument

public class Bounds3d implements MemInstrument

Implementation of `MemInstrument`.

## Fields

- min | Vector3d | final Vector3d field.
- max | Vector3d | final Vector3d field.

## Constructors

- Bounds3d() | Creates a new Bounds3d instance.
- Bounds3d(@Nonnull Vector3d min, @Nonnull Vector3d max) | Creates a new Bounds3d instance.

## Methods

- contains(@Nonnull Vector3d position) | boolean | public method.
- contains(@Nonnull Bounds3d other) | boolean | public method.
- intersects(@Nonnull Bounds3d other) | boolean | public method.
- isZeroVolume() | boolean | public method.
- getSize() | Vector3d | public method.
- assign(@Nonnull Bounds3d other) | Bounds3d | public method.
- assign(@Nonnull Vector3d min, @Nonnull Vector3d max) | Bounds3d | public method.
- offset(@Nonnull Vector3d vector) | Bounds3d | public method.
- intersect(@Nonnull Bounds3d other) | Bounds3d | public method.
- encompass(@Nonnull Bounds3d other) | Bounds3d | public method.
- encompass(@Nonnull Vector3d position) | Bounds3d | public method.
- stack(@Nonnull Bounds3d other) | Bounds3d | public method.
- flipOnOriginPoint() | Bounds3d | public method.
- flipOnOriginVoxel() | Bounds3d | public method.
- clone() | Bounds3d | public method.
- isCorrect() | boolean | public method.
- correct() | void | public method.
- getMemoryUsage() | MemInstrument.Report | public method.

Also in this package: Bounds3i

Complete API:
  public boolean contains(int x, int y, int z)
  public boolean contains(double x, double y, double z)
  public boolean contains(Vector3i position)
  public boolean contains(Vector3d position)
  public boolean contains(Bounds3d other)
  public boolean intersects(Bounds3d other)
  public boolean isZeroVolume()
  public Vector3d getSize()
  public Bounds3d assign(Bounds3d other)
  public Bounds3d assign(Bounds3i other)
  public Bounds3d assign(Vector3d min, Vector3d max)
  public Bounds3d offset(Vector3d vector)
  public Bounds3d offsetOpposite(Vector3d vector)
  public Bounds3d intersect(Bounds3d other)
  public Bounds3d encompass(Bounds3d other)
  public Bounds3d encompass(Vector3d position)
  public Bounds3d stack(Bounds3d other)
  public Bounds3d flipOnOriginPoint()
  public Bounds3d flipOnOriginVoxel()
  public Bounds3d applyRotation(RotationTuple rotationTuple, Vector3d anchor)
  public Bounds3d undoRotation(RotationTuple rotationTuple, Vector3d anchor)
  public Bounds3d clone()
  public boolean isCorrect()
  public void correct()
  public MemInstrument.Report getMemoryUsage()

Fields:
public static final Bounds3d ZERO
public final Vector3d min
public final Vector3d max

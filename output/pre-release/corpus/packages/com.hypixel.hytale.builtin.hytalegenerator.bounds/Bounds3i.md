# Bounds3i

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.bounds | Implements: MemInstrument

public class Bounds3i implements MemInstrument

Implementation of `MemInstrument`.

## Fields

- min | Vector3i | final Vector3i field.
- max | Vector3i | final Vector3i field.

## Constructors

- Bounds3i() | Creates a new Bounds3i instance.
- Bounds3i(@Nonnull Vector3i min, @Nonnull Vector3i max) | Creates a new Bounds3i instance.

## Methods

- contains(@Nonnull Vector3i position) | boolean | public method.
- contains(@Nonnull Bounds3i other) | boolean | public method.
- intersects(@Nonnull Bounds3i other) | boolean | public method.
- isZeroVolume() | boolean | public method.
- getSize() | Vector3i | public method.
- assign(@Nonnull Bounds3i other) | Bounds3i | public method.
- assign(@Nonnull Vector3i min, @Nonnull Vector3i max) | Bounds3i | public method.
- offset(@Nonnull Vector3i vector) | Bounds3i | public method.
- intersect(@Nonnull Bounds3i other) | Bounds3i | public method.
- encompass(@Nonnull Bounds3i other) | Bounds3i | public method.
- encompass(@Nonnull Vector3i position) | Bounds3i | public method.
- stack(@Nonnull Bounds3i other) | Bounds3i | public method.
- flipOnOriginPoint() | Bounds3i | public method.
- flipOnOriginVoxel() | Bounds3i | public method.
- toBounds3d() | Bounds3d | public method.
- clone() | Bounds3i | public method.
- isCorrect() | boolean | public method.
- correct() | void | public method.
- getMemoryUsage() | MemInstrument.Report | public method.

Also in this package: Bounds3d

Complete API:
  public boolean contains(int x, int y, int z)
  public boolean contains(double x, double y, double z)
  public boolean contains(Vector3i position)
  public boolean contains(Vector3d position)
  public boolean contains(Bounds3i other)
  public boolean intersects(Bounds3i other)
  public boolean isZeroVolume()
  public Vector3i getSize()
  public Bounds3i assign(Bounds3i other)
  public Bounds3i assign(Vector3i min, Vector3i max)
  public Bounds3i offset(int x, int y, int z)
  public Bounds3i offset(Vector3i vector)
  public Bounds3i offsetOpposite(Vector3i vector)
  public Bounds3i intersect(Bounds3i other)
  public Bounds3i encompass(Bounds3i other)
  public Bounds3i encompass(Vector3i position)
  public Bounds3i stack(Bounds3i other)
  public Bounds3i flipOnOriginPoint()
  public Bounds3i flipOnOriginVoxel()
  public Bounds3i applyRotationAroundVoxel(RotationTuple rotationTuple, Vector3i anchor)
  public Bounds3i undoRotationAroundVoxel(RotationTuple rotationTuple, Vector3i anchor)
  public Bounds3d toBounds3d()
  public Bounds3i clone()
  public boolean isCorrect()
  public void correct()
  public MemInstrument.Report getMemoryUsage()

Fields:
public static final Bounds3i ZERO
public final Vector3i min
public final Vector3i max
